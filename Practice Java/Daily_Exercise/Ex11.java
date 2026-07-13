public class Ex11{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Suraj Patil");
        p1.setAge(23);
        p1.setEmail("suraj@gmail.com");

        System.out.println(p1.toString());
    }
}
class Person{
    private String name;
    private int age;
    private String Email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >= 18 && age<=60){
            this.age = age;
        }
        
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", Email=" + Email + "]";
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {

        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                Email = email;
                break;
            }
        }
    }

    

}