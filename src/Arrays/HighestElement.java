package Arrays;

public class HighestElement {

    public int findHighest(int[] arr) {
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 3, 2};

        HighestElement obj = new HighestElement();
        System.out.println(obj.findHighest(arr));
    }
}
