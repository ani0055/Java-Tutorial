package Keyword;

abstract class Car{ //Can't create object of Abstract Class but can be referenced.
    public abstract void drive(); //Declaring an Method to be implemented in the child class.
    public abstract void fly();//Compulsory to define in the extended class

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{ //Concrete Class
    public void drive(){
        System.out.println("Driving...");
    }
    
    public void fly(){
        System.out.println("Flying....");
    }
}

public class AbstractKey {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
