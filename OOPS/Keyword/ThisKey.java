package Keyword;
class Human{
    private int age = 21; 
    private String Name = "Animesh";
    private double CGPA; // here the CGPA is an local variable

    public int getAge(){ //By using methods we can take the private variable data outside the class
        return age;
    }

    public String getName(){
        return Name;
    }

    public void setCGPA(double CGPA){//here the CGPA is an instance variable
        this.CGPA = CGPA; // here the compiler gets confused that which is local and which is instance that's wjhy it sets value 0
    }                     //this keyword represents the current object

    public double getCGPA(){
        return CGPA;
    }
}

public class ThisKey {
      public static void main(String[] args) {
        Human obj = new Human();
        obj.setCGPA(7.76);

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println("CGPA is : " + obj.getCGPA());
    }
}
