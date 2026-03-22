package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    private int[] ReverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 3, 2};

        ReverseAnArray obj = new ReverseAnArray();
        System.out.println(Arrays.toString(obj.ReverseArray(arr)));
    }
}