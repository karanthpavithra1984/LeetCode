package medium.dp;

public class PaintFence {
    public int numWays(int n, int k) {
        //if there are 1 post in the fence , you can paint the fence in k number of ways
        if(n == 1){
            return k;
        }
        //If there are two then , you can paint both the fences in same color or different color.
        //Assuming k = 2, then there are 4 ways i.e k^2
        if(n == 2){
            return k * k;
        }

        int[] dp = new int[n+1];
        dp[1] = k;
        dp[2] = k * k;

        //The ith spot can be different as i-1 color i.e dp[i-1]
        //And also dp[i-1] can be painted in k-1 ways , since kth paint is used for ith spot
        //The ith spot can same as i-1 the color i.e dp[i-2] should be a different color
        for(int i = 3; i <= n; i++){
            dp[i] = (k-1) * (dp[i-1] + dp[i-2]);
        }

        return dp[n];
    }
}
