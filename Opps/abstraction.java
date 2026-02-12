// abstration =  bhai tu aam khaa na, ghutli kyu gin rha h
//               user only use the method , dont know how its working, dont know about its implementation

// abstration 
// -1- using abstract class
// -2- using interfaces

// abstract class = is-a relationship 
//                  all child class extend the same behaviour 
//                  Dont create object

//Interface =   not a class, its a set of abilities
//              can-do relationship 
//              not-related class can also use it to use its capabilities


abstract class Animal{
    abstract void eat();
    abstract void speak();
}

interface Flyable{
    void fly();
}

class Sparrow extends Animal implements Flyable{
    // sparrow is a animal and can do fly
    public void eat(){
        System.out.println("Sparrow eats seeds");
    }
    public void speak(){
        System.out.println("Sparrow chirps");
    }
    public void fly(){
        System.out.println("Sparrow flies");
    }
}

class Drone implements Flyable{
    // drone is not a animal but can do fly
   
    public void fly(){
        System.out.println("Drone flies");
    }
}

class Fish extends Animal{
    // fish is a animal but can not fly
   
    public void eat(){
        System.out.println("Fish eats plants");
    }
    public void speak(){
        System.out.println("Fish makes bubbles");
    }
}


class abstraction{
    public static void main(String[] args){
        Animal a1 = new Sparrow();
        Animal a2 = new Fish();
        Flyable f1 = new Sparrow();
        Flyable f2 = new Drone();

        a1.eat();
        a2.eat();
        f1.fly();
        f2.fly();
    }
}