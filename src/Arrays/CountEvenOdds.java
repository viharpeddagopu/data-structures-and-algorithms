package Arrays;

public class CountEvenOdds {
    public int[] counter(int[] arr){
        int evens = 0, odds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0)
                evens++;
            else
                odds++;
        }
        return new int[]{evens, odds};
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 3};

        CountEvenOdds obj = new CountEvenOdds();
        int[] ans = obj.counter(arr);
        System.out.println("no of evens" + ans[0] + "\nno of odds" +ans[1]en);
    }
}
