public class Exe3 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Redmi");
        Mobile m3 = new Mobile("Apple", 150000);
    }
    
}
class Mobile{
    public String Brand;
    public int Price;

    public Mobile(){
        System.out.println("Constructor 1");
    }

    public Mobile(String Brand){
        this.Brand = Brand;
         System.out.println("Constructor 2");
    }

    public Mobile(String Brand, int Price){
        this.Brand = Brand;
        this.Price = Price;
         System.out.println("Constructor 3");
    }
}