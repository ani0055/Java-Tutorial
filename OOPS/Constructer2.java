
class Human{
    private int age; 
    private String Name;
    private double CGPA; 

    public Human(){ //Constructor should be of the same name as the class //Default Constructor
        System.out.println("In Constructor so Paartyyyyyyyyyyyyyyyyyy !!!!!!");
        age = 21;
        Name = "Animesh";
    }

    public Human (int age , String Name){ //Parameterized Conustructor
        this.age = age;
        this.Name = Name;
    }

    public int getAge(){ 
        return age;
    }

    public String getName(){
        return Name;
    }

    public void setCGPA(double CGPA){
        this.CGPA = CGPA; 
    }                     

    public double getCGPA(){
        return CGPA;
    }
}
public class Constructer2 {
       public static void main(String[] args) {
        Human obj = new Human();
        Human Obj1 = new Human(25,"Krishna");
        obj.setCGPA(7.76);

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println("CGPA is : " + obj.getCGPA());
        System.out.println(Obj1.getAge() + " : " + Obj1.getName());
}
}
