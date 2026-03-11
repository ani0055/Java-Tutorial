class AnimeshException extends Exception{
    public AnimeshException(String str){
        super(str);
    }
}

public class Throw {
    public static void main(String[] args) {
        int i = 20 ;
        int j = 0 ;
        String str = null;
        try{
            j = 18/i;
            if(j==0)
                throw new AnimeshException("I don't want to give 0"); //thorw help us throw an exceptions when there is no exception
        }
        catch(AnimeshException e ){ //Only Executed when the try block is true
            System.out.println("Can not Divide by zero "+ e);
            j = 18/1;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in the limits of the Array");
        }
        catch(Exception e){  //Always write the Exception on the bottom of all the TypeExceptons
            System.out.println("Something went wrong ... " + e);
        }
        System.out.println(j);
        System.out.println("The is Fine");
    }
}
