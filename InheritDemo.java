public class InheritDemo {
	public static void main(String[] args) {
		
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		InheritCar car = new InheritCar();
		
		car.go();
		
		InheritBicycle bike = new InheritBicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.door);
		System.out.println(bike.pedals);
				
	}
}