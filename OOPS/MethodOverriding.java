class A {
    public void show(){
        System.out.println("In show of A");
    }

    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A{
    public void show(){ //Method is overrinding where the class favours its method
        System.out.println("In show B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
