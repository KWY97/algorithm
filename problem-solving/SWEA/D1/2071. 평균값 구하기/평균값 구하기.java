import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int len = 10;

        for (int tc = 0; tc < T; tc++) {
            int total = 0;

            for (int i = 0; i < len; i++) {
                int n = scanner.nextInt();
                total += n;
            }

            double ans = (double)total / len;
            System.out.printf("#%d %.0f\n", tc + 1, ans);
        }
    }
}
