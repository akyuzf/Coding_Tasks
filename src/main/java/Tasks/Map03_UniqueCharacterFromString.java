package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Map03_UniqueCharacterFromString {

    public static void main(String[] args) {

        String str = "accabbcde";


        System.out.println("-------------");
        char[] chrArr = str.toCharArray();
        System.out.println(chrArr);

        String str2= new String(chrArr);
        System.out.println(str2);

        String str3 = String.valueOf(chrArr);
        System.out.println(str3);
        System.out.println("--------------");


        Map<String, Integer> mapUniq = new HashMap<>();
        mapUniq.put("a", 1);
        mapUniq.put("c", 3);
        mapUniq.put("b", 2);
        System.out.println(mapUniq);
        System.out.println(mapUniq.entrySet());

        System.out.println("==========================");

        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }

}
