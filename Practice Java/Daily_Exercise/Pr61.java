public class Pr61 {
    public static void main(String[] args) {
        dog g = new dog("Labrador");
        g.Breed();
        g.has4Legs();
        g.walk();
    }
}

class dog implements Animal,Pet{

    public String breed;

    dog(String breed){
        this.breed = breed;
    }

    public void has4Legs(){
        System.out.println(true);
    }

    public void Breed(){
        System.out.println("Breed of Dog is " + breed);
    }
}

interface Animal{
    default void walk(){
        System.out.println("Animal is Walking");
    }

    void has4Legs();
}

interface Pet{
    void Breed();
}
