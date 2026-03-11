class Student{
    int rollNo;
    String Name;
    int Marks;

}

public class ObjectArray {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.rollNo = 25;
       s1.Name = "Animesh";
       s1.Marks = 89;

       Student s2 = new Student();
       s2.rollNo = 26;
       s2.Name = "Onkar";
       s2.Marks = 95;

        Student s3 = new Student();
       s3.rollNo = 27;
       s3.Name = "Piyush";
       s3.Marks = 98;

       Student students[] = new Student[3];
       students[0] = s1;
       students[1] = s2;
       students[2] = s3;

       for(int i=0;i<students.length;i++){
        System.out.println(students[i].Name + " " + students[i].rollNo + " ");
       }


    }
}
