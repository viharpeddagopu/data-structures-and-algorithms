package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
    public static int[] findTopKELements(int[] nums, int k){

        //adding the elements of the array to the hashmap as: number -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
//            if(!map.containsKey(num))
//                map.put(num, 1);
//            else
//                map.put(num, map.get(num)+1);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        //creating a new bucket as : frequency -> numbers
        List<Integer>[] bucket = new List[nums.length + 1];

        int index;
        for (int key : map.keySet()){
            index = map.get(key);

            if (bucket[index] == null) {
                bucket[index] = new ArrayList<>();
            }
            bucket[index].add(key);
        }

        //extracting top elements
        index = 0;
        int[] result = new int[k];

        for (int i = bucket.length-1; i >= 0; i--){
            if (bucket[i] != null){
                for (int num : bucket[i]){
                    result[index] = num;
                    index++;

                    if (index == k) return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3};
        int k = 2;

        int[] result = findTopKELements(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


//refer this: https://www.youtube.com/watch?v=YPTqKIgVk-k&list=PLot-Xpze53ldVwtstag2TL4HQhAnC8ATf&index=72