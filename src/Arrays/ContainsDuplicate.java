package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        ContainsDuplicate obj = new ContainsDuplicate();
        System.out.println(obj.hasDuplicate(arr));
    }
}

//brute force: check each element with the other elements in the array
//brute force: sort the array, then compare adjacent elements

//Better approach using Hashset:
//      1. add an element if it is not present in the hashset
//      2. if the element is present in the hashset, then there is a duplicate
