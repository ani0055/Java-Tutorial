class A{
    public void show(){
        System.out.println("This Class A Show");
    }
}

class B extends A{
       public void show(){
        System.out.println("This Class B Show");
    }
}

class C extends A{
       public void show(){
        System.out.println("This Class C Show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B(); //Object of B and reference of A or Reference of SuperClas and Object of Subclass
        obj.show();

        //Dynamic Method Dispatch
        //All because of Inheritance and Polymorphism

        obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }

}
