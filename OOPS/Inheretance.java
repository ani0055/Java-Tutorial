class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int substract(int n1, int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int multiply(int n1, int n2){
        return n1*n2;
    }

    public int divide(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }
}

public class Inheretance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(25,63);
        int r2 = obj.substract(25,14);

        System.out.println(r1 + " " + r2);

        AdvCalc obj1 = new AdvCalc();
        int r3 = obj1.multiply(20, 12);
        int r4 = obj1.divide(50, 10);
        int r5 = obj1.add(25, 99);

        
        System.out.println(r3 + " " + r4 + " " + r5);

        VeryAdvCalc obj2 = new VeryAdvCalc();
        int r6 = (int)obj2.power(5, 3);

        System.out.println(r6);


    }
}
