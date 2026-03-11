interface Computer{
    void code(); // In interface By Default every method is public Abstract.
    int Age = 21; //In interface By Default every Variable is final and Static
}

class Laptop implements Computer{ // When we implements we only gets the Method not the variables
    public void code(){
        System.out.println("Code, Compile, Run .....");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run Faster .....");
    }
}

class Developer{
    public void Develope(Computer Com){
        Com.code();
    }
}
public class InterFaces {
    public static void main(String[] args) {
        Developer Animesh = new Developer();
        Computer Lap = new Laptop();
        Computer Desk = new Desktop();
        Animesh.Develope(Desk);
        System.out.println(Computer.Age);
    }
}
