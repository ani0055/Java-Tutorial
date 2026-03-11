class DataType{
    public static void main(String[] args) {
        double an = 5.6;
        long l = 2564315l;
        boolean t = true;
        char c = 'k'; 

        float bn = 5.62f;
        System.out.println(an + bn);

        int b=0b10001; //for binary no. to decimal
        System.out.println(b);
        int num1=0x7e4; //for Hexadecimal no. to decimal
        System.out.println(num1);

        int zero = 10_00_00_000;
        System.out.println(zero);

        char a = 'a';
        a++;
        System.out.println(a);


    }
}