package medium.BinarySearch;

public class CanShip {
    public int shipWithinDays(int[] weights, int days) {
        //Get maxLoad and totalLoad

        int maxLoad = 0;
        int totalLoad = 0;
        for(int weight : weights){
            totalLoad += weight;
            maxLoad = Math.max(maxLoad, weight);
        }

        int low = maxLoad;
        int high = totalLoad;

        //Lets do binary search
        while(low < high){
            int capacity  = ( low  + high )/2;

            if(canShip(weights, capacity, days)){
                //If can ship with capacity, try to find minimum capacity
                high = capacity;
            }else{
                //cannot ship so increase the capactiy
                low = capacity + 1;
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int capacity, int days){
        int daysNeeded = 1;

        int currenLoad = 0;
        for(int weight: weights){
            currenLoad += weight;
            if(currenLoad > capacity){
                //Ship the package and move to nextDay
                daysNeeded++;
                currenLoad = weight;
            }
        }

        return daysNeeded <= days;
    }
}
