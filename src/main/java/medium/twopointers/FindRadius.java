package medium.twopointers;

import java.util.Arrays;

public class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        int houseLen = houses.length;
        int heaterLen = heaters.length;

        int ho = 0, he = 0, dist1, dist2 = Integer.MAX_VALUE, res = 0;

        Arrays.sort(heaters);
        Arrays.sort(houses);

        while(ho < houseLen && he < heaterLen){
            //first heater
            dist1 = Math.abs(houses[ho] - heaters[he]);

            //If next heater is present calculate the distance
            if(he+1 < heaterLen){
                dist2 = Math.abs(houses[ho] - heaters[he+1]);
            }

            //if closer to the first heater , then move the house
            if(dist1 < dist2) {
                ho++;
                res = Math.max(res, dist1);
            }else{
                he++; // Move heater
            }
        }

        return res;
    }
}
