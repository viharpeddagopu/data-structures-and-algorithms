package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static int[] greaterElement(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        // traverse twice from right to left
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // remove smaller/equal elements
            while (!stack.isEmpty() &&
                    stack.peek() <= arr[index]) {

                stack.pop();
            }

            // only fill answers in first pass
            if (i < n) {

                if (!stack.isEmpty()) {
                    result[index] = stack.peek();
                }
            }

            stack.push(arr[index]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 12, 1, 11};
        int[] result = greaterElement(arr);

        System.out.println(Arrays.toString(result));
    }
}


//Brute Force

//public static int[] greaterElement(int[] arr){
//    int[] result = new int[arr.length];
//    Arrays.fill(result, -1);
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i+1; j < i+ arr.length-1; j++) { //search till before element as a circular loop
//            int index = j % arr.length;
//
//            if (arr[index] > arr[i]) {
//                result[i] = arr[index];
//                break;
//            }
//        }
//    }
//    return result;
//}