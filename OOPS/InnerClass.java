class A{
    int Age;
    
    public void show(){
        System.out.println("In Show...");
    }


    static class B{ //Static can be used for only inner Class not for outer Class
        public void Config(){
            System.out.println("In Config...");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //A.B obj1 = obj.new B();// When the inner Class is non static

        A.B obj1 = new A.B(); //Whne the inner class is static
        obj1.Config();
    }
}
