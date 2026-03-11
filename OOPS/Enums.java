enum Status{
    //Enum is a special data type used to define a collection of constant values
    //typically a fixed set of related identifiers.
    Running, Failed, Pending, Success;
}

public class Enums {
    public static void main(String[] args) {
        int i = 5 ;
        Status s = Status.Running;
        Status[] ss = Status.values();
        System.out.println(s);
        System.out.println(s.ordinal());
        for(Status r : ss){
            System.out.println(r+" : " + r.ordinal());
        }
        System.out.println(s.getClass().getSuperclass());
    }
}
