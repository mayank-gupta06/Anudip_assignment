package Main;
import java.util.HashMap;
import java.util.Map;

public class Ma_in {
  public static void main(String[] args) {
    String s = "This is a test string";
    findDuplicateCharacters(s);
  }

  public static void findDuplicateCharacters(String s) {
    
    Map<Character, Integer> map = new HashMap<>();

   
    char[] charArray = s.toCharArray();

    for (char c : charArray) {
      if (!map.containsKey(c)) {
        map.put(c, 1);
      }
      else {
        int count = map.get(c);
        map.put(c, count + 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    }
  }
}
