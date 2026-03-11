import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        // int num = System.in.read(); // returns an input value gives  an ASCII value
        // System.out.println(num - 48);
        // InputStreamReader in = new InputStreamReader(System.in); //Has to be definned finmd trhe reason
        // BufferedReader bf = new BufferedReader(in); //Buffer Reader is an resource which take any input like file, network

        // int num = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
