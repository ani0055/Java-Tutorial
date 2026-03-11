// Method overloading 
//Writing various methods with same name and different parameters

class Calculator{
    public int add( int n1, int n2){
        //int num; //instance variable
        return n1 + n2 ;//n1 and n2 are local variable
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3 ;
    }
     public double add( double n1, int n2){
        return n1 + n2 ;
    }
}

public class Initial {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator(); //refrencing the class as calc just say calc of type Calculator(Object Creating)

        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}
