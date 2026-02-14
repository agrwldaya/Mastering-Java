

class OuterClass {
    private String message = "Hello from the Outer Class!";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }
}

interface runnable {
    void run();
}

class demo{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Anonymous class implementing an interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class!");
            }
        };
        runnable.run();
    }
}