class Human{
    private int age = 21; // by using private the variable is only accessable inside the class not out side
    private String Name = "Animesh";
    private double CGPA;

    public int getAge(){ //By using methods we can take the private variable data outside the class
        return age;
    }

    public String getName(){
        return Name;
    }

    public void setCGPA(double a){
        CGPA = a;
    }

    public double getCGPA(){
        return CGPA;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setCGPA(7.76);

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println("CGPA is : " + obj.getCGPA());
    }
}