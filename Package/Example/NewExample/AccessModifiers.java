package Package.Example.NewExample;
import Package.Example.OtherExample.*;

public class AccessModifiers {
    public static void main(String[] args) {
        A obj2 = new A();
        int r1 = obj2.a;//if there was no public keyword before the a in Class A then it wouldn't have been accesses

                        //For accessing data or method outside the package it is needed to have public keyword
    }
}
