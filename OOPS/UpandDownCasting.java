class A{
    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}

public  class UpandDownCasting{
    public static void main(String[] args) {
        
    A obj = (A)new B(); // upcasting as obj is being Typecasted as A while being object of B
    obj.show1();
    
    B obj1 = (B)obj; //obj is getting down casted as object of B since it was and object of type A
    obj1.show2();
    
    }
}