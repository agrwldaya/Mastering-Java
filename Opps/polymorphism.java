// Polymorphism = one references = diff behaviours
// Two type -
//   1 - Compile time(static binding) -   Method overloading
//       - use compile time binding(look at reference) ( var, private method, static method, final method  always use comipile time binding)
//   2 - Runtime (Dynamic binding)  - Method overriding
//      -  Use Runtime binding (look at object type) - decide at runtime 

// compile time polymorphism

class Test{
    int x = 10;

    public void add(int a,int b){
        System.out.println("int sum->"+ a+b);
    }
    public void add(double a,int b){
        System.out.println("double-int sum->"+ a+b);
    }
}

// runtime polymorphism
class A{
    void show(){ System.out.println("A"); }
}
class B extends A{
    void show(){ System.out.println("B"); }
}

// some trap case- val, static, private

class X{
    public int val = 10;
    static void display(){
        System.out.println("Static method in X");
    }
    private void show(){
        System.out.println("Private method in X");
    }
}
class Y extends X{
    public int val = 20;
    static void display(){
        System.out.println("Static method in Y");
    }
    private void show(){
        System.out.println("Private method in Y");
    }
}
 
class polymorphism{
    public static void main(String[]args){
        // compile time polymorphism
        Test t = new Test();
        t.add(5,10);
        t.add(5.5,10);

        // runtime polymorphism
        A a = new B(); // upcasting
        a.show(); // it will call B's show method

        // trap case
        X x = new Y();
        x.display(); // it will call X's display method because static method is resolved at compile time
        // x.show(); // it will give error because private method is not inherited

        System.out.println(x.val); // it will print 10 because variable is resolved at compile time
    }
}