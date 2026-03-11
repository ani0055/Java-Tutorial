// Thread is the smallest unit of a task or smallest unit you can work with
class A extends Thread{
    public void run(){
        for(int i = 0 ; i<=100;i++){
            System.out.println("In A show ");
            try{
            Thread.sleep(10); // To interupt the process by 10 millisecond after that it will sleep for 10 millisec
            }catch(InterruptedException e){ e.printStackTrace();}
        }
        
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0 ; i<=100;i++){
            System.out.println("In B show");
            try{
            Thread.sleep(10); // To interupt the process by 10 millisecond after that it will sleep for 10 millisec
            }catch(InterruptedException e){ e.printStackTrace();}
        }
        
    }
}

public class Threading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // Starting the run method in calss
        obj2.start();



        System.out.println(obj1.getPriority());
    }
}
