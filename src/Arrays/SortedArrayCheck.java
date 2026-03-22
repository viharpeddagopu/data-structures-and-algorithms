package Arrays;

public class SortedArrayCheck {
    public boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        SortedArrayCheck obj = new SortedArrayCheck();
        if (obj.isSorted(arr))
            System.out.println("the array is in non-decreasing order");
        else
            System.out.println("the array is not in non-decreasing order");
    }
}
