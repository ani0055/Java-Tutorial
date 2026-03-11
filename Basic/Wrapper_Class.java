public class Wrapper_Class {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; // Boxing : num1 = new Intetger(num) here we have used autoBoxing

        int num2 = num1; //auto Unboxing we are converting an wrapper to an primitive datatype

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);

    }
}
