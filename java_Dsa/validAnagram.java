import java.util.HashMap;
import java.util.Map;

public class validAnagram {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() == t.length()){
//            int len=s.length();
//            Map<Character, Integer > map1 = new HashMap<>();
//            for(int i=0 ; i < len; i++){
//                char x = s.charAt(i);
//                if(map1.containsKey(s.charAt(i))){
//
//                    int y =map1.get(s.charAt(i));
//                    map1.replace(x , y, y + 1);
//                }
//                else{
//                    map1.put(x,1);
//
//                }
//
//            }
//            Map<Character, Integer > map2 = new HashMap<>();
//            for(int i=0 ; i < len; i++){
//                char x = t.charAt(i);
//                if(map2.containsKey(t.charAt(i))){
//
//                    int y = map2.get(t.charAt(i));
//                    map2.replace(x , y, y + 1);
//                }
//                else{
//                    map2.put(x,1);
//
//                }
//            }
//            return map1.equals(map2);
//        }
//        return false;
//
//    }

    public void mapUpdate (String s, Map<Character, Integer> map, int i, int step){
        char Char = s.charAt(i);
        map.put(Char, map.getOrDefault(Char, 0) + step);

    }
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            Map<Character, Integer> map = new HashMap<>();
            int len = s.length();
            for (int i = 0; i < len; i++) {

                mapUpdate(s, map, i, 1);

                mapUpdate(t, map, i, -1);

//            char sChar = s.charAt(i);
//            if (map.containsKey(sChar)){
//                int sNum = map.get(sChar);
//                map.replace(sChar, sNum, sNum+1);
//            }
//            else {
//                map.put(sChar, 1);
//            }
//            char tChar = t.charAt(i);
//            if (map.containsKey(tChar)){
//                int tNum = map.get(tChar);
//                map.replace(tChar, tNum, tNum-1);
//            }
//            else {
//                map.put(tChar, -1);
//            }
            }
            for (Integer value : map.values()) {
                if (value != 0) {
                    return false;
                }
            }
            return true;


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