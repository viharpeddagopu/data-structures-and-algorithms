package Arrays;

import java.util.*;

public class GroupAnagrams {
    public static HashMap<String, List<String>> anagramGroups(String[] strs){
        /* HashMap<String, List<String>> map = new HashMap<>();

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

        return map;*/

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            //key generation
            int[] count = new int[26];

            for (char c : str.toCharArray()){
                count[c - 'a']++;
            }

            //adding # to before each number element in the count array
            StringBuilder sb = new StringBuilder();
            for (int c : count){
                sb.append('#').append(c);
            }
            String key = sb.toString();

            //Hashmap implementation
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};

        HashMap<String, List<String>> result = anagramGroups(strs);

        for (String key : result.keySet()) {
            System.out.println(result.get(key));
        }
    }
}


//Sorting way.
//first we sort the element in the array, and check if it is present in the hashmap
        //if not present, add it as a new key and add that string to the list
        //if present, add the string to the list of that particular key
        //but the time complexity becomes, for sorting, O(nlogn) and for m strings, it becomes O(m.nlogn)

//better approach
        //we use an array of size 26, and generate a key for each string
        //eg: eat --> #1#0#0#0#1#0........
        //we this key, we add strings to that list related to the ky in the hashmap
        //then return the map as result