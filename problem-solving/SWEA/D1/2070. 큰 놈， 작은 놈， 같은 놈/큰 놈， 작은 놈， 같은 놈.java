import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        
        for (int i = 1; i < T+1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            String ans = "";
            
            if (a > b) {
                ans = ">";
            } else if (a < b) {
                ans = "<";
            } else {
                ans = "=";
            }

            System.out.println("#" + i + " " + ans);
        }
    }
}
