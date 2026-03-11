// Class -> Class use extends
// 

interface A {
    void show();
    void Config();
}

interface X{
    void Run();
}

interface Y extends X{ //Inheritance is applicable

}

class B implements A,Y{

    public void Run() {
        System.out.println("Run Run Run .....");
    }

    public void show() {
        System.out.println(" In A Show");
    }

    public void Config() {
        System.out.println(" In Config");
    }
    
}

public class MultipleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.Run();
    }
}
