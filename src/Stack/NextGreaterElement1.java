package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static int[] nextGreatElement(int[] nums1, int[] nums2) {

        //add nums one to hashmap
        HashMap<Integer, Integer> nums1_map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++)
            nums1_map.put(nums1[i], i);

        //initialize each value to -1
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        Stack<Integer> temp_stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            int current = nums2[i];

            while(!temp_stack.isEmpty() && current > temp_stack.peek()){
                int value = temp_stack.pop();
                int nums1Index = nums1_map.get(value);
                result[nums1Index] = current;
            }

            if (nums1_map.containsKey(current)){
                temp_stack.push(current);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {2,1,3,4};
        int[] result = nextGreatElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}

//brute force method
//public static int[] nextGreatElement(int[] nums1, int[] nums2){
//
//    //add nums one to hashmap
//    HashMap<Integer, Integer> nums1_map = new HashMap<>();
//    for (int i = 0; i < nums1.length; i++)
//        nums1_map.put(nums1[i], i);
//
//    //initialize each value to -1
//    int[] result = new int[nums1.length];
//    Arrays.fill(result, -1);
//
//    int index;
//    for (int i = 0; i < nums2.length; i++) {
//        if (!nums1_map.containsKey(nums2[i]))
//            continue;
//
//        for (int j = i+1; j < nums2.length; j++) {
//            if (nums2[j] > nums2[i]){
//                index = nums1_map.get(nums2[i]);
//                result[index] = nums2[j];
//                break;
//            }
//        }
//    }
//    return result;
//}