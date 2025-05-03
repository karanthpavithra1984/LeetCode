package medium.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        int one  = 1, two = 2;
        for(int i=3 ; i <= n ; i++){
            int temp = two;
            two += one;
            one = temp;
        }

        return two;
    }
}
