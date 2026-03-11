abstract class A{
    public abstract void show();
    public abstract void Config();
}


public class AnonymousInner {
    public static void main(String[] args) {
    //     A obj = new A(){
    //         public void show(){
    //             System.out.println("In New A Show....");
    // }
    //     };
    //     obj.show();

    // We can use Anonymous Inner class to instanciate An abstract calss 
         A obj = new A(){
            public void show(){
                System.out.println("In A Show....");
            }

            public void Config(){
                System.out.println("In Config....");
            }
        };
        obj.show();
        obj.Config();

    }
}
