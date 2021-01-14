package ksk.dp;

public class LongestIncreasingSubsequence {


    static int findLISLength(int[] nums) {

        if (nums.length == 0) return 0;
        int maxLength = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                    maxLength = Math.max(maxLength, dp[j] + 1);
                }
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {4, 2, 3, 6, 10, 1, 12};
        System.out.println(lis.findLISLength(nums));
        nums = new int[]{-4, 10, 3, 7, 15};
        System.out.println(lis.findLISLength(nums));

    }


}