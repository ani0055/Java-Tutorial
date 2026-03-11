package DSA.Stack.Questions;

import java.util.Stack;
import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Push opening brackets onto stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Handle closing brackets
            else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if closing bracket matches the most recent opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // String is valid only if all brackets were matched (stack is empty)
        return stack.isEmpty();
    }
    
    // Test cases
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paranthesis : ");
        String p = sc.nextLine();
        boolean b = isValid(p);
        System.out.println(b);
        sc.close();
    }
}
