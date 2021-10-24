package basic;

public class ClimbStairs {
    public static void main(String[] args) {
        int stairs = 10;
        int[] dp = new int[stairs + 1];
        int maxSteps = 3;
        dp[0] = 1;
        for (int i = 1; i <= stairs; i++) {
            for (int j = 1; j <= maxSteps; j++) {
                int prev = i - j;
                if (prev < 0 || prev == 3 || prev == 6) {
                    continue;
                }
                dp[i] += dp[prev];
            }
        }
        System.out.println(dp[stairs]);
    }    
}
