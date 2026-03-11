public class Execptions {
    public static void main(String[] args) {
        int i = 0 ;
        int j = 0 ;
        int nums[] = new int[5];
        String str = null;
        try{
            System.out.println(str.length());
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e ){ //Only Executed when the try block is true
            System.out.println("Can not Divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in the limits of the Array");
        }
        catch(Exception e){  //Always write the Exception on the bottom of all the TypeExceptons
            System.out.println("Something went wrong ... " + e);
        }
        System.out.println("The is Fine");
    }
}

                               