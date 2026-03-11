//thread safe is a method which 
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}



public class ThreadMutation{
   public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->{
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };
        Runnable obj2 = () ->{
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();
        //here as the 2 threads are sharing the same imcrement variable due to which there is a loss in count
        // Therefore the syncronized keyword is used here because when t1 is using then the t2 has to wait to access the increment
        t1.join();//Pauses the main thread till this thread complets the excecution
        t2.join();
        System.out.println(c.count); // here teh value excpected is 2000 but we get value 0 or <2000 because main will print the syso without waiting for the threads to complete tghere job

    }
}