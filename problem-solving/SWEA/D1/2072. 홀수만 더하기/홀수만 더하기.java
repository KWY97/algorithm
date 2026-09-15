import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int len = 10;

        for (int tc = 0; tc < T; tc++) {
            int ans = 0;

            for (int j = 0; j < len; j++) {
                int n = scanner.nextInt();
                if (n % 2 != 0) {
                    ans += n;
                }
            }
            System.out.printf("#%d %d\n", tc + 1, ans);
        }
    }
}
