package Questions.GFG160.Strings;

public class stringToChamelCase {
    public static void main(String[] args) {
        
    }
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i<sb.length(); i++){
            char c = sb.charAt(i);
            if(c == ' '){
                sb.deleteCharAt(i);
                if(i<sb.length()){
                     sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                }
               
               i--; 
            }
        }
        return sb.toString();
    }
}
