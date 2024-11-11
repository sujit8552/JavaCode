package sujit;
import bank.Bank;
import bank.*;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-parameterized constructor
    Student(){
        System.out.println("Non-parameterized ctor called");
    }

    // Parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    // function overloading - compile type polymorphism
    public void PrintInfo(String name){
        System.out.println(this.name);
    }

    public void PrintInfo(int age){
        System.out.println(this.age);
    }

    public void PrintInfo(String name,int age){
        System.out.println(this.name +" , "+ this.age);
    }

}
// Inheritance example
class Shape{
    String color;
    public void area(){
        System.out.println("Display area");
    }
}
// single level inheritance
// class triangle extends/inherits Shape class (so properties and methods also extended)
class Triangle extends Shape{
    // Base class properties are inherited here
    public void Area(){
        System.out.println("Triangle area");
    }
}
// multi-level inheritance
class EquilateralTriangle extends Triangle{
    public void Area(){
        System.out.println("Equilateral triangle area");
    }
}
// Hierarchical inheritance
class Rectangle extends Shape{
    public void Area(){
        System.out.println("Area of Rectangle");
    }
}

public class Oops {
    public static void main(String[] args){
//        Pen pen1 = new Pen(); // instantiation of object
//        pen1.color = "Blue";
//        pen1.type = "gel";
//        pen1.write();
//
//        Pen pen2 = new Pen();
//        pen2.color = "red";
//        pen2.type = "Ball";
//
//        pen1.printColor();
//        pen2.printColor();

//        Student s1 = new Student(); // non-param ctor called
//        Student s2 = new Student("Ram",25); // param constructor called
//        s1.PrintInfo();
//        s2.PrintInfo();
//
//        Student s3 = new Student(s2); //copy constructor called
//        s3.PrintInfo();

        // PolyMorphism = Poly means Many , Morphism means Form , when we do same work with different/many forms
        // 1) Function Overloading - Compile time polymorphism (methods of same name but different signature/parameters)
        // 2) Function Overriding - Run time polymorphism
        // Example of 1) Function Overloading
//        Student s4 = new Student("sujit",24);
//        s4.PrintInfo(s4.name);
//        s4.PrintInfo(s4.age);
//        s4.PrintInfo(s4.name,s4.age);

        // Inheritance
        // class Triangle extends the class Shape (also there properties)
        Triangle t1 = new Triangle();
        t1.color = "Red";

        // Java mainly have this 4 types of inheritance
        // 1) Single-level inheritance
        // 2) Multi-level inheritance
        // 3) Hierarchical inheritance
        // 4) Hybrid inheritance
        // *5) Multiple inheritance - not available through class but through "interfaces"

        Triangle t5 = new Triangle();
        t5.Area();
        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.Area();
        Rectangle r1 = new Rectangle();
        r1.area();

        // Package
        Bank b = new Bank();

    }
}
