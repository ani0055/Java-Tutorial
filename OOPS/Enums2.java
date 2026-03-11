enum Laptop{
    MacBook(2000), XPS(2200), Surface(1500), Thinkpad(1200);
     
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price){
        this.price = price;
    }
}
public class Enums2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.MacBook;
        System.out.println(lap + " : "+lap.getPrice());

        for(Laptop laptops : Laptop.values()){
            System.out.println(laptops + " : " + laptops.getPrice());
        }

    }
}
