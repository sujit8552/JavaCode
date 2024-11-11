package sujit;

// Abstraction - means to showcase only important things to user and hide other things
// For e.g. ATM Machine (Process is hide but Simple Interface is shown to user)
// Abstraction is done by 2 ways - 1) By using Abstract class 2) By interfaces

// abstract means concept, it is a thought and it is present there but can't be used directly
abstract class Animal{
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    // now this method is abstract method so each type of Animal should override this method
    abstract void Walk();
    // We can have abstract and non abstract method in abstract class
    public void eat(){
        System.out.println("Animal eats");
    }
    final void Eyes(){
        System.out.println("Animal only have 2 eyes");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a new Horse");
    }
    public void Walk(){
        System.out.println("Walks on 4 legs");
    }
    // Below class cannot be overriden as it is "final" in base class
    //public void Eyes(){
    //    System.out.println("4 eyes");
    //}
}

class Chicken extends Animal{
    public void Walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.Walk();
        horse.eat();
        // abstract class cannot be instantiated
        // This cannot be done => Animal animal = new Animal();
        // Whenever you create derived class object it will call first base class ctor and then
        // - derived class ctor. this is called as constructor chaining
    }
}
