// lambda expression is baically replace of anonymous class and it is used to provide implementation of functional interface
// functional interface is an interface which contain only one abstract method and it can have any number of default and static method
// lambda expression is a short form of anonymous class and it is used to provide implementation of functional


interface runnable {
    void run();
}
interface MyFunctionalInterface {
    int operate(int a, int b);
}
class Lambda {
    public static void main(String[] args) {

        // Anonymous class to implement a functional interface
        runnable r = new runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Anonymous Class!");
            }
        };

        // Lambda expression to implement a functional interface
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        
        // Running the lambda expression
        runnable.run();

        //lambda with parameters
        MyFunctionalInterface add = (a, b) -> a + b;

        // labmda with return type
        MyFunctionalInterface multiply = (a, b) -> a * b;
    }
}