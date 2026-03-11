class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A Show");
    }
}

class B extends A{
    @Override //Anotations Which tells the Compiler to override the method
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B Show");
    }
}
public class Anotations{
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}