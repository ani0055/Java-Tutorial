package DSA.Collection;
import java.util.*;
public class Maps { // Map is a collection of key and value pair
    public static void main(String[] args) {
        Map<String, Integer> Students = new HashMap<>(); // Here we have to input 2 sdata types
        Students.put("Animesh Gawhale", 95);
        Students.put("Onkar Rane", 98);
        Students.put("Patrik Chavan",88 );
        Students.put("Spandan Meshram", 68);
        Students.put("ChutPaglu", 32);
        //Keys can't be repeated they are unique
        System.out.println(Students);
        System.out.println(Students.get("Onkar Rane"));

        System.out.println(Students.keySet());

        for(String key : Students.keySet()){
            System.out.println(key + " : " + Students.get(key));
        
        }
    }
}

// Similar to HashMap there is a HashTable which is similar only difference it that it is syncronized
