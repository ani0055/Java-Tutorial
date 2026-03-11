package Keyword;
class Mobile{
    String Brand;
    int Price;
    static String Type; // Called with the class name are shared by different object

    static{ //Satic block. Is called only once. Used to Initiallise the Static Variable
        Type = "Phone";
        System.out.println("In the Static Block");
    }

    public Mobile(){ //Constructor
        Brand = "";
        Price = 200;
        System.out.println("In the Constructor");
    }



    public void show(){
        System.out.println(Brand + " | " + Price + " | " + Type);
    }
}

public class StaticKey {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");// only loads the class Mobile
        // Mobile obj1 = new Mobile();
        // obj1.Brand = "Apple";
        // obj1.Price = 1500 ; 
        // Mobile.Type = "Smart Phone";

        // Mobile obj2 = new Mobile();


    }
}
