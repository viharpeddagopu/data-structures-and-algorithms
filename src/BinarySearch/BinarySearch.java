package BinarySearch;

public class BinarySearch {

    // Recursive Binary Search
    public static int binarySearch(int[] arr,
                                   int target,
                                   int left,
                                   int right) {

        // base case
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        // target found
        if (arr[mid] == target) {
            return mid;
        }

        // search left half
        if (target < arr[mid]) {
            return binarySearch(arr,
                    target,
                    left,
                    mid - 1);
        }

        // search right half
        return binarySearch(arr,
                target,
                mid + 1,
                right);
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 15};

        int target = 9;

        int result = binarySearch(arr,
                target,
                0,
                arr.length - 1);

        System.out.println(result);
    }
}


/*
----------------------------------------
Iterative (While Loop) Alternative
----------------------------------------

public static int binarySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // search left half
        else if (target < arr[mid]) {
            right = mid - 1;
        }

        // search right half
        else {
            left = mid + 1;
        }
    }

    return -1;
}

*/