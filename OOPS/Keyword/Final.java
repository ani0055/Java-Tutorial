package Keyword;

final class Calc{ //By final class we can prevent Inheritance
    public final void show(){ // bY Final method we can prevent method overriding
        System.out.println("In Calc show");
    }

    public void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
}



public class Final {
    public static void main(String[] args) {
        final int num = 90; //Given a final keyword the variable becomes permanent and its value can't be changed 
    
        
    }
}
