import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[] nums = new int[10];
        int ans = 0;

        for (int tc = 1; tc < T+1; tc++) {
            for (int i = 0; i < 10; i++) {
                nums[i] = scanner.nextInt();
            }

            ans = Arrays.stream(nums).max().getAsInt();

            System.out.println("#" + tc + " " + ans);
        }
    }
}
