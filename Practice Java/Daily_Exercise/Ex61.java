// package Daily_Exercise;

class Ex61 {

    public static void main(String[] args) {
        Square s = x -> x*x;

        System.out.println(s.square(21));
    }
    
}

@FunctionalInterface
interface Square {

    int square(int x);

}