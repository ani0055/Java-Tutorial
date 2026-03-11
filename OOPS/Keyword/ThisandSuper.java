package Keyword;
class A{
    public A(){
        super(); // it is there by default but can't see it
        System.out.println("This is Class a");
    }

    public A(int n){
        super(); // Calls the super class 1st that's why 1st class A is printed then B
        System.out.println("This is a int" );
    }
}
class B extends A{
     public B(){
        super(); //by this the parameterized constructor of the a will be called
        System.out.println("This is Class b");
    }

    public B(int n){
        this();// Calls the defau;t constructor of the Class
        System.out.println("In Class b int");
    }

}
public class ThisandSuper {
  public static void main(String[] args) {
    B obj = new B(5);
  }
}

//NAming Conventions 

//Class and Interfaces - Calc, Human
//Variables and Methods - age, name, fuck, showData, fuckYou
//constants - PIE, DATA
