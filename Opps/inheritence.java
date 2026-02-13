

class Animal{
    int x = 10;
    // Animal(){
    //     System.out.println("Animal constructor called!");
    // }

    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    int x = 20;

    
    // Dog(){
    //     System.out.println("Dog constructor called!");
    // }
    
    public void eat(){
        System.out.println("Dog eats");
    }

    public void bark(){
        System.out.println("Dog barks");
    }

}
class inheritence{

    public static void main(String[] args){
        Animal a = new Dog();
        Dog d1 = new Dog();
        System.out.println(a.x);  // 10
        System.out.println(d1.x); // 20
        a.eat();  // Dog eats -- because of method overriding, checkthe type of object at runtime
        d1.eat(); // Dog eats

        // Dog d2 = new Animal();  -- parent can't inherit child
    }
}