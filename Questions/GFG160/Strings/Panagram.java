package Questions.GFG160.Strings;

public class Panagram {
     static final int MAX_CHAR = 26; 
      static boolean checkPangramOofNSquare(String s) {

        for(char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for(int i = 0; i < s.length(); i++) {
                if(ch == Character.toLowerCase(s.charAt(i))) {
                    found = true;
                    break;
                }
            }
            if(found == false)
                return false;
        }
        return true;
    }

    public static boolean checkPangram(String s) {
        boolean[] vis = new boolean[MAX_CHAR];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                vis[c - 'A'] = true;
            else if (c >= 'a' && c <= 'z')
                vis[c - 'a'] = true;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            if (!vis[i])
                return false;
        }
        return true;
    }
}
