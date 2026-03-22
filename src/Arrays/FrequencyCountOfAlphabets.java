package Arrays;

import java.util.HashMap;

public class FrequencyCountOfAlphabets {

    /* array implementation
        public static int[] countFrequency(String str){
            int[] alphabets = new int[26];

            for (int i=0; i< str.length(); i++){
                alphabets[str.charAt(i) - 'a']++;
            }
            return alphabets;
       }
   */

    //hashmap implementation
    public static HashMap<Character, Integer> countFrequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        String str = "Vihar";

//        int[] ans = countFrequency(str.toLowerCase());
//        for (int i = 0; i < ans.length; i++) {
//            if (ans[i] != 0)
//                System.out.println((char) (i+'a') +" = " + ans[i]);
//        }

        HashMap<Character, Integer> result = countFrequency(str.toLowerCase());
        for (char c : result.keySet()) {
            System.out.println(c + " = " + result.get(c));
        }
    }
}
