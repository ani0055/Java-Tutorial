@FunctionalInterface
interface Ani {
    void Show();
}
class Bye implements Ani{
    public void Show()
    {
        System.out.println("In B Show Method");
    }
}
public class functionalInterface {
    public static void main(String[] args) {
        Ani obj = () -> System.out.println("In A Show"); //Lambda Expression for Functional Interfaces    
        Bye obj1 = new Bye(); // In the above Lambda expression we can put or pass the parameters in the ()
        obj.Show();
        obj1.Show();

    }
}
