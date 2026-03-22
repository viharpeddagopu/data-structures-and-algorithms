package Arrays;

import java.util.*;

public class GroupAnagrams {
    public static HashMap<String, List<String>> anagramGroups(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs){

            //sort the words in the string array to make a common between the anagrams.
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return map;
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};

        HashMap<String, List<String>> result = anagramGroups(strs);

        System.out.println(result);
    }
}