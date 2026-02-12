import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {

        int a[] = new int[8];
        System.out.println("Enter Array");

        Scanner sc = new Scanner(System.in);
        int i, k;

        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter value of K");
        k = sc.nextInt();

        int start = 0;
        int sum = 0;
        int max = 0;

        for (int end = 0; end < a.length; end++) {
            sum = sum + a[end];

            while (sum > k) {
                sum = sum - a[start];
                start++;
            }

            int length = end - start + 1;
            if (length > max) {
                max = length;
            }
        }

        System.out.println("Longest subarray length = " + max);
    }
}
