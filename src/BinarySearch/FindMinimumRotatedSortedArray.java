package BinarySearch;

public class FindMinimumRotatedSortedArray {

    public static int findMin(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // minimum is in right half
            if (arr[mid] > arr[right]) {

                left = mid + 1;
            }

            // minimum is in left half including mid
            else {

                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(findMin(arr));
    }
}