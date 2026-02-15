// @Override is not required to override — it is required to ensure you actually did override.
// @Override = compiler protection for polymorphism


class A{
    int x = 10;
    void show(){};
    @Deprecated
    void dikhao(){};
    void greet(){
        System.out.println("A is greeting");
    }
}

interface myfunc1{
    void run();
    void stop();
}

@FunctionalInterface
interface myfunc2{
    void run();
    // void stop(); -- cant write this bcz FunctionalInterface allow only one 
}

class B extends A{
    //  without override annotation this shoow will run and it become hard to find these silent bug in our system as we were intended to override show in child class
    @Override 
    void show(){
        System.out.println("B ka show");
    }

    void dikhao(){
        System.out.println("Old dikhao");
    }
}

class annotation{
        public static void main(String[]args){
            A obj = new B();
            obj.show();
            obj.dikhao();
            // obj.greeting();
            System.out.println(obj.x);
        }
}