class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        int dpn=dp.length;
        dp[dpn-1]=0;
        for(int i=dpn-2;i>=0;i--){
            if(i+2==dpn){
                dp[i]=cost[i]+dp[i+1];
            }
            else{
                dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        }
        int mans=Math.min(dp[0],dp[1]);
        return mans;
    }
}