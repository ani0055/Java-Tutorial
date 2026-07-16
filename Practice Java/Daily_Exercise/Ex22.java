public class Ex22{
    public static void main(String[] args) {
        Car Susuki = new Car("Alto");

        Susuki.start();
        Susuki.drive();
    }
}

class Vehicle{
    public String brand;

    public void start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{
    public String model;

    public Car(String model){
        this.model = model;
    }

    public void drive(){
        System.out.println("Driving " + model);
    }
}