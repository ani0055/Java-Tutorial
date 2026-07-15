public class Ex21{
    public static void main(String[] args) {
        Student s1 = new Student("Kaveri Prasad", 16, 23);
        s1.displayInfo();

    
    }
}

class Person{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name : " + name + ", Age : "+ age);
    }
}

class Student extends Person{

    public int rollNo ;
    

    public Student(String name, int age, int rollNo){

        super(name, age);
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

    }
    


}