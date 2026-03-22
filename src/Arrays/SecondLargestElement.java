package Arrays;

public class SecondLargestElement {
    public int secondLargeVal(int[] arr){
        int highest = arr[0];
        int ans = -1; //ans --> 2nd highest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest){
                ans = highest;
                highest = arr[i];
            }
            if (arr[i] > ans && arr[i] < highest)
                ans = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 3};

        SecondLargestElement obj = new SecondLargestElement();
        System.out.println(obj.secondLargeVal(arr));
    }
}
