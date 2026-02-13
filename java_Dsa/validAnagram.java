import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            int len=s.length();
            Map<Character, Integer > map1 = new HashMap<>();
            for(int i=0 ; i < len; i++){
                char x = s.charAt(i);
                if(map1.containsKey(s.charAt(i))){

                    int y =map1.get(s.charAt(i));
                    map1.replace(x , y, y + 1);
                }
                else{
                    map1.put(x,1);

                }

            }
            Map<Character, Integer > map2 = new HashMap<>();
            for(int i=0 ; i < len; i++){
                char x = t.charAt(i);
                if(map2.containsKey(t.charAt(i))){

                    int y = map2.get(t.charAt(i));
                    map2.replace(x , y, y + 1);
                }
                else{
                    map2.put(x,1);

                }
            }
            return map1.equals(map2);
        }
        return false;

    }

    public static void main(String[] args) {
        validAnagram va = new validAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = va.isAnagram(s, t);
        System.out.println("Is anagram: " + result);
    }
}