package medium.dp;

public class ZeroesAndOnes {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer[][][] dp = new Integer[strs.length+1][m+1][n+1];

        return dfs(strs, 0, m, n, dp);
    }

    private int dfs(String[] strs, int index , int zeros, int ones, Integer[][][] dp){
        if(index == strs.length){
            return 0;
        }

        if(dp[index][zeros][ones] != null){
            return dp[index][zeros][ones] ;
        }

        int[] count = countZerosAndOnes(strs[index]);
        //with current string
        int taken = 0;
        if(zeros - count[0] >= 0 && ones - count[1] >= 0){
            taken = 1+
                    dfs(strs, index+1, zeros-count[0], ones-count[1],dp);
        }
        return dp[index][zeros][ones] = Math.max(taken,
                dfs(strs, index+1, zeros, ones, dp) );

    }

    private int[] countZerosAndOnes(String str){
        int[] count = new int[2];

        for(Character character: str.toCharArray()){
            if(character == '0'){
                count[0]++;
            }else{
                count[1]++;
            }
        }
        return count;
    }
}
