// How can we use the Runnable Interface 
class A implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i<=10;i++){
            System.out.println("In A show ");
            try{
            Thread.sleep(10); 
            }catch(InterruptedException e){ e.printStackTrace();}
        }
        
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0 ; i<=10;i++){
            System.out.println("In B show");
            try{
            Thread.sleep(10); 
            }catch(InterruptedException e){ e.printStackTrace();}
        }
        
    }
}

public class RunnableClass {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();
        // Lambda expressions can also be used instead of the classes creration


    }
}
