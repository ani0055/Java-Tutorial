package DSA.Recursion;

public class isStringPalindrome {
    public static boolean stringRev(String s, int l, int r){
        if(l == r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return stringRev(s, l+1, r-1);
    }

    public static void main(String[] args) {
        System.out.println(stringRev("racecar", 0, "racecar".length()-1));;
    }
}
