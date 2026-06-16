package Daily_Exercise;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee arr[] = new Employee[5];
        for(int i = 0; i<5 ; i++){
            arr[i] = new Employee();
            System.out.println("Enter Employee Name : ");
            arr[i].name = sc.nextLine();
            System.out.println("Enter Employee Salary : ");
            arr[i].salary = sc.nextInt();

            sc.nextLine();

        }

        for(Employee emp : arr){
            System.out.println(emp.toString());
        }
    }
}

class Employee{
    public String name;
    public int salary;
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    


}
