package sujit;
// Interfaces are nothing but similar to class but we can say pure abstract class
// They are declared with interface keyword

interface Bird{
    int eyes = 2; // this is public,final & cannot be overriden
    void walk(); //it cannot have body
}

interface HerbivoreBird{
    String food = "Veg";
}

class Parrot implements Bird{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

// Multiple inheritance achived by interfaces
class Chimani implements Bird,HerbivoreBird{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        p1.walk();
        Chimani c1 = new Chimani();
        c1.walk();
    }
}

