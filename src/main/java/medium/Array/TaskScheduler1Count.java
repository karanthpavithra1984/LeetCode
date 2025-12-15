package medium.Array;

import java.util.Arrays;

public class TaskScheduler1Count {
    public int leastInterval(char[] tasks, int n) {
        int[] charFreq = new int[26];

        for (char task : tasks) {
            charFreq[task - 'A']++;
        }

        //This is a different approach.
        Arrays.sort(charFreq);
        int maxFrequency = charFreq[25];
        //Number of idle slots
        //Suppose we have 3 A's , then if they should be spaced between n spaces.
        // assuming n = 2 , its going to be A__A__A = so 4 spaces i.e (3-1)*2
        int idleSlots = (maxFrequency - 1)*n;

        //Now lets fill up remaining spaces
        for(int i=24; i>=0 ;i--){
            //Now if we have 3 Bs , we only have 4 spaces and they should be spaced 2,
            //we can only consider 2
            if(charFreq[i] >= maxFrequency){
                idleSlots -= maxFrequency-1;
            }else{
                idleSlots-=charFreq[i];
            }
        }

        //If idleSlots
        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;
    }
}
