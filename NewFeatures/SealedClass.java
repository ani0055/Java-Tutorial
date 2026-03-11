package NewFeatures;

sealed class A permits B,C {  //sealed keyworf is used to permits few classes to allow the access here B,C
    
}

non-sealed class B extends A{ //the permited classes needs to be either final or non sealed or sealed

}

final class C extends A{

}

class D{

}
public class SealedClass {
    public static void main(String[] args) {
        
    }
}
