package TwoPointers;

public class ReverseString {
    public static String reversedString(String s){
        int left = 0, right = s.length()-1;
        char[] c = s.toCharArray();

        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String str = "Vihar";

        System.out.println("reversed string is: " +reversedString(str));
    }
}
