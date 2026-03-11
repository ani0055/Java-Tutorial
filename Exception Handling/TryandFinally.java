import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TryandFinally{ //We can write a try block without using the catch bloack but there we will use the finally block
    public static void main(String[] args) throws IOException {
        //Finally block helps us to closeing the resources and it will be executed no matter what
        BufferedReader bf = null;
        try{
            int i = 0;
            int j = 18;
            bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(j/i);
        }
        catch(Exception e){
            System.out.println("Error" + e);
        }
        finally{
            System.out.println("Thje code is save");
            bf.close();
        }
    }
}