package collections;

import java.util.HashSet;

public class Assign2 {
    public static void main(String[] args) {
        HashSet<String> A = new HashSet<>();
        HashSet<String> B = new HashSet<>();

        A.add("Alice");
        A.add("Bob");
        A.add("Charlie");
        A.add("Diana");

        B.add("Charlie");
        B.add("Diana");
        B.add("Eve");
        B.add("Frank");

        HashSet<String> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println(intersection);

        HashSet<String> SubsA = new HashSet<>(A);
        SubsA.removeAll(B);
        System.out.println(SubsA);

        HashSet<String> SubsB = new HashSet<>(B);
        SubsB.removeAll(A);
        System.out.println(SubsB);

        HashSet<String> Union = new HashSet<>(A);
        Union.addAll(B);
        System.out.println(Union);
        
    }
}
