/* 
    Summary of Execution Flow:
    1. Static Variables 
    2. Static Blocks 
    3. Static Methods (if called) 
    4. Instance Variables
    5. Instance Blocks
    6. Constructor
    7. Instance Methods (if called) 
*/

class ExecutionOrder {
    static int staticVar = initializeStaticVar(); 

    static {
        System.out.println("Static Block");
    }

    int instanceVar = initializeInstanceVar(); 

    {
        System.out.println("Instance Block");
    }

    ExecutionOrder() {
        System.out.println("Constructor");
    }

    static int initializeStaticVar() {
        System.out.println("Static Variable Initialized");
        return 10;
    }

    int initializeInstanceVar() {
        System.out.println("Instance Variable Initialized");
        return 20;
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        System.out.println("Non-static Method"); 
    }

    public static void main(String[] args) {
        staticMethod(); 

        ExecutionOrder obj = new ExecutionOrder(); 

        obj.instanceMethod();
    }
}
