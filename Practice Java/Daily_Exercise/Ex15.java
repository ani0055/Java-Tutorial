public class Ex15 {
    public static void main(String[] args) {
        laptop lap = new laptop(16589);
        lap.setBrand("Lenovo");
        lap.setModel("Yoga");
        lap.setPrice(125000);

        System.out.println(lap.toString());

    }
}

class laptop{
    private final int serialNumber; // this should be final since it is the only identifying factor for the laptop also this should only get getters and no setters
    private String brand;
    private String model;
    private double price;

    public laptop(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }



    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "laptop [serialNumber=" + serialNumber + ", brand=" + brand + ", model=" + model + ", price=" + price
                + "]";
    }

    
    

}
