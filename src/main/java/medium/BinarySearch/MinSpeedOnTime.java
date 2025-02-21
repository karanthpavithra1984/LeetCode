package medium.BinarySearch;

import java.util.stream.IntStream;

public class MinSpeedOnTime {
    public int minSpeedOnTime(int[] dist, double hour) {
        int minSpeed = 1;
        int maxSpeed = 10000000;

        int speed = -1;

        while(minSpeed <= maxSpeed) {
            int midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;

            double totalHour=0;

            for(int i = 0; i < dist.length; i++){
                double curHour = (double)dist[i]/midSpeed;
                //We want to retain the last distance hour in decimal
                totalHour += (i == dist.length-1) ? curHour : Math.ceil(curHour);

                if(totalHour > hour){
                    break;
                }
            }

            //So if the totalHour it takes to cover the distance is less than hour, its time to look for a shorter midSpeed
            if(totalHour <= hour){
                speed = midSpeed;
                maxSpeed = midSpeed - 1 ;
            }else{
                minSpeed = midSpeed + 1;
            }
        }

        return speed;


    }
}
