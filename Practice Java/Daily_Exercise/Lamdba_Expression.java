public class Lamdba_Expression{
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;

        System.out.println(c.calculate(10, 20));

        Greeting g = name -> System.out.println("Hello " + name);

        g.greet("Animesh");
    }
}

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);

}

@FunctionalInterface
interface Greeting {

    void greet(String name);

}


