public class conditionals {
    public static void main(String[] args) {
        int x= 8;
        if(x>10){
        System.out.println("Hello");
        }
        else{
        System.out.println("Bye");
        }

        //Ternary Operator

        int result = x%2==0?10:20;
        System.out.println(result);
    }
}
