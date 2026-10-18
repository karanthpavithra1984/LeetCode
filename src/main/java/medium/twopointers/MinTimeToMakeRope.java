package medium.twopointers;

public class MinTimeToMakeRope {
    public int minCost(String colors, int[] neededTime) {
        int currentMax = neededTime[0]; //First one
        int totalTime = 0;

        for(int i=0; i < neededTime.length; i++){
            if(colors.charAt(i-1) == colors.charAt(i)){
                //Two consecutive Baloons
                totalTime += Math.min(currentMax, neededTime[i]); //Get minimum time to the total
                currentMax = Math.max(currentMax, neededTime[i]); //Get the maximum time
            }else{
                //Different baloon
                currentMax = neededTime[i];
            }
        }

        return totalTime;
    }
}
