package DSA.Backtracking;
import java.util.ArrayList;

class Subset{
    static void subset(int i,int n ,ArrayList current){
        if(i > n){
            System.out.println(current);
            return ;
        }
        current.add(i);
        subset(i + 1, n, current);
        current.remove(current.size() - 1);
        subset(i + 1, n, current);
    }

    public static void stringSubSet(int i, String s, StringBuilder current){
        if(i == s.length()){
            System.out.println(current);
            return;
        }

        current.append(s.charAt(i));
        stringSubSet(i+1, s, current);
        current.deleteCharAt(current.length()-1);
        stringSubSet(i+1, s, current);
    }


    public static void main(String[] args) {
        int n = 4;
        subset(1,n,new ArrayList<>());
        String s = "ABC";
        stringSubSet(0, s, new StringBuilder());
    }
}