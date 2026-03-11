class Mobile{
    String Brand;
    int Price;
    static String Type; // Called with the class name are shared by different object

    public void show(){
        System.out.println(Brand + " | " + Price + " | " + Type);
    }
}

public class Constructor {
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

    }
}
