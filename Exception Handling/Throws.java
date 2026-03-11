class A{
    public void Show()throws ClassNotFoundException{
        //The throws keyword in Java is used to declare exceptions that a method might throw during its execution.
        // It signals to the caller of the method that they need to handle or propagate the exception.
        // Mainly used for Checked Exceptions.
        Class.forName("Animesh");
    }
}
public class Throws {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.Show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
