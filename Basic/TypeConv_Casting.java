public class TypeConv_Casting {
    public static void main(String[] args) {
        byte a = 25;
        int c = a; //inplicit Conversion or conversion

        int n = 255;
        byte b = (byte)n;// explicit conversion or Casting

        System.out.println(b);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);
    }
}
