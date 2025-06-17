Absolutely! Here's a **comprehensive, developer-friendly Kubernetes and Docker cheat sheet** — packed with practical **commands**, **YAML snippets**, and **code samples** that cover 90% of what you'll actually use.

---

# 🐳 **Docker Cheat Sheet**

### 🔹 Image & Container Management


docker build -t myapp .             # Build Docker image
docker images                       # List local images
docker rmi image_id                 # Remove image

docker run -d -p 8080:8080 myapp    # Run container in detached mode
docker ps                           # List running containers
docker stop container_id            # Stop a container
docker rm container_id              # Remove container

docker exec -it container_id    # Access container shell
docker logs container_id            # View container logs


### 🔹 Dockerfile (Java App Example)

Dockerfile
FROM openjdk:17
WORKDIR /app
COPY target/myapp.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


### 🔹 Docker Volumes & Networks


docker volume create myvolume
docker network create mynetwork

docker run -v myvolume:/data myapp
docker run --network=mynetwork myapp


---

### 🔹 Docker Compose

#### docker-compose.yml

yaml
version: '3'
services:
  java-app:
    build: .
    ports:
      - 8080:8080
    environment:
      - SPRING_PROFILES_ACTIVE=dev
    volumes:
      - ./logs:/app/logs

  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: rootpass
      MYSQL_DATABASE: mydb
    ports:
      - 3306:3306



docker-compose up -d
docker-compose down
docker-compose logs -f
docker-compose exec java-app 


---

# ☸️ **Kubernetes Cheat Sheet**

### 🔹 Setup & Access


kubectl config use-context minikube       # Switch context
kubectl cluster-info                      # View cluster info
kubectl get all                           # View all resources


### 🔹 Deployments & Pods


kubectl create deployment myapp --image=myapp:1.0
kubectl get deployments
kubectl describe deployment myapp
kubectl delete deployment myapp

kubectl get pods
kubectl logs pod-name
kubectl exec -it pod-name -- 


### 🔹 YAML: Deployment Example

yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: java-app
spec:
  replicas: 2
  selector:
    matchLabels:
      app: java-app
  template:
    metadata:
      labels:
        app: java-app
    spec:
      containers:
      - name: java-container
        image: midejoe/java-api:2.0
        ports:
        - containerPort: 8080



kubectl apply -f deployment.yaml


---

### 🔹 Service (NodePort)

yaml
apiVersion: v1
kind: Service
metadata:
  name: java-service
spec:
  selector:
    app: java-app
  ports:
    - protocol: TCP
      port: 80
      targetPort: 8080
      nodePort: 30080
  type: NodePort



kubectl apply -f service.yaml
kubectl get svc


---

### 🔹 ConfigMap & Secrets

yaml
# configmap.yaml
apiVersion: v1
kind: ConfigMap
metadata:
  name: app-config
data:
  SPRING_PROFILES_ACTIVE: dev


yaml
# secret.yaml
apiVersion: v1
kind: Secret
metadata:
  name: db-secret
type: Opaque
data:
  username: YWRtaW4=       # base64 for 'admin'
  password: cGFzc3dvcmQ=   # base64 for 'password'



kubectl apply -f configmap.yaml
kubectl apply -f secret.yaml


---

### 🔹 Ingress (Expose via domain)

yaml
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: myapp-ingress
  annotations:
    nginx.ingress.kubernetes.io/rewrite-target: /
spec:
  rules:
  - host: myapp.local
    http:
      paths:
      - path: /
        pathType: Prefix
        backend:
          service:
            name: java-service
            port:
              number: 80


---

### 🔹 Scaling, Update, Rollback


kubectl scale deployment java-app --replicas=3

kubectl set image deployment/java-app java-container=midejoe/java-api:2.1
kubectl rollout status deployment java-app
kubectl rollout undo deployment java-app


---

### 🔹 Health Checks

yaml
livenessProbe:
  httpGet:
    path: /actuator/health
    port: 8080
  initialDelaySeconds: 10
  periodSeconds: 5

readinessProbe:
  httpGet:
    path: /actuator/health
    port: 8080
  initialDelaySeconds: 5
  periodSeconds: 5


---

### 🔹 Port Forward (Testing Locally)


kubectl port-forward svc/java-service 8080:80


---

### 🔹 Minikube / Kind


minikube start
kubectl apply -f .  # Apply all YAMLs
minikube dashboard  # GUI


---


