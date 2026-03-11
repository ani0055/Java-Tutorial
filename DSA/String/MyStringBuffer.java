

public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Animesh");
        System.out.println(sb.capacity());
        sb.append(" Gawhale");
        System.out.println(sb);
        sb.insert(7, " Rajesh");

        String str = sb.toString(); // to convert StringBuffer to String.
        System.out.println(str);
    }
}
