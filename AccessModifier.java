package sujit;

class Account{
    public String name; // public access modifier
    String name2; // default access modifier
    // (default can be accessed by any file of this package sujit)
    protected String email; // protected
    private String password; // private

    // Getter
    public String GetPassword(){
        return this.password;
    }
    //Setter
    public void SetPassword(String password){
        this.password = password;
    }
}

public class AccessModifier {
    public static void main(String[] args) {

        // main class is always public because compiler wants to know the entry point for
        // the execution
        // 4 Types of Access Modifiers/Specifiers
        // 1) Public - Can be accessed from anywhere
        // 2) Private - only accessed within that class, cannot be accessed in package
        // 3) Protected - Current package can access it & in other package by only sub-class
        // 4) Default - it will already exists if we dont add any specifier

        Account a1 = new Account();
        a1.name = "sujit";
        a1.name2 = "name";
        a1.email = "Mail";
//        a1.password = "123"; // this is not possible;
        // Then how we can access the private members? Ans => Getters & Setters
        a1.SetPassword("Ram");
        System.out.println(a1.GetPassword());

        // Encapsulation
        // Creating classes itself encapsulate the methods and the properties(data)
        // So it is called as encapsulation
        /* Data Hiding concept is possible due to this encapsulation and it is done with
         the help of access modifiers (private , public)



        */
    }

}
