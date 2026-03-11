package DSA.Recursion;

public class StringRev {
    public static void strRev(int i, String s){
        if (i == s.length()) return ;
        strRev(i+1, s);
        System.out.print(s.charAt(i));
    }

    public static void strRev(String s){
        // using the substring
        if(s.length() == 0) return;

        strRev(s.substring(1,s.length()));
        System.out.print(s.charAt(0));
    }

    public static void main(String[] args) {
        String s ="Animesh Gawhale";
        strRev(0,s);
        System.out.println(" ");
        strRev(s);;
    }
}
