package BinarySearch;

public class SearchInRotatedSortedArray {

    public static int binarySearchinRotatedSortedArray(int[] arr,
                                                       int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // target found
            if (arr[mid] == target) {
                return mid;
            }

            // left half sorted
            if (arr[left] <= arr[mid]) {

                // target inside left half
                if (target >= arr[left] &&
                        target < arr[mid]) {

                    right = mid - 1;
                }

                // target in right half
                else {
                    left = mid + 1;
                }
            }

            // right half sorted
            else {

                // target inside right half
                if (target > arr[mid] &&
                        target <= arr[right]) {

                    left = mid + 1;
                }

                // target in left half
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(
                binarySearchinRotatedSortedArray(arr, 0)
        );
    }
}