public class Ex51{
    public static void main(String[] args) {
        Employee d = new Developer("Kajal", 25000);
        d.displayInfo();
        d.calculateBonus();

        Employee m = new Manager("Tanvi", 45000);
        m.displayInfo();
        m.calculateBonus();
    }
}

abstract class Employee{
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void displayInfo(){
        System.out.println("Name : " + name + " Salary : $" + salary);
    }

    

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    abstract void calculateBonus();
}

class Developer extends Employee{
    
    Developer(String name, int salary){
        super(name,salary);
    }

    void calculateBonus(){
        int bonus = 10*getSalary()/100;
        System.out.println("Bonus for " + getName() +" is $"+bonus);
    }
}

class Manager extends Employee{
    
    Manager(String name, int salary){
        super(name,salary);
    }

    void calculateBonus(){
        int bonus = 20*getSalary()/100;
        System.out.println("Bonus for" + getName() +" is $"+bonus);
    }

}