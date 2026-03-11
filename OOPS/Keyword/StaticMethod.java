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

    public static void show1(Mobile obj){
        System.out.println("In static Method");
        System.out.println(obj.Brand + " | " + obj.Price + " | " + Type);//A non ststic variable can't get access in Static method
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 1500 ; 
        Mobile.Type = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.Price = 1200;
        Mobile.Type = "Smart Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);// Static method can be called directly without creating an object


    }
}
