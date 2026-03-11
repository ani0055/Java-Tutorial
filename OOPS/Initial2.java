class Computer{

    public Computer(){
        System.out.println("object Created");
    }
    public void playMusic(){
        System.out.println("Playing Music ...");
    }

    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen";
        return "No Pen";
        
        
    }
}

public class Initial2{
    public static void main(String[] args) {
    // Computer Dell = new Computer(); // Creating an Object

    // Dell.playMusic();
    // String str = Dell.getMeAPen(1);
    // System.out.println(str);
        new Computer(); //Anonymous Object. Can't be used again
     }

}