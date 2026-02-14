
final class A{
    int x = 10;
    public void fun(){
        System.out.println("Fun method in class A");
    }
}

// class b extends A{  // error because class A is final and can't be inherited
//     int y = 20;
//     public void fun(){
//         System.out.println("Fun method in class B");
//     }
// }

class c{
    final public void fun(){
        System.out.println("Fun method in class C");
    }
}

class d extends c{
    // public void fun(){  // error because fun() is final in class c and can't be overridden
    //     System.out.println("Fun method in class D");
    // }
}


class finaldemo {
    public static void main(String[] args) {
        final int a = 10; // final variable, can't be changed
        // a = 20; // error: can't assign a new value to a final variable

        final c obj = new c();
        // obj = new c(); // error: can't assign a new object to a final reference variable

        c c1 = new c();
        c c2 = new c();

        System.out.println(c1.equals(c2)); // prints false because c1 and c2 are different objects

    }
}