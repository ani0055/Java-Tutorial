package Daily_Exercise;

public class Ex2 {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.setName("LOQ");
        l1.setBrand("Lenovo");
        l1.setPrice(1099.90f);

        laptop l2 = new laptop();
        l2 = l1;

        l1.setPrice(999.99f);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}

class laptop{
    private String name;
    private String brand;
    private float price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "laptop [name=" + name + ", brand=" + brand + ", price=" + price + "]";
    }

    
}
