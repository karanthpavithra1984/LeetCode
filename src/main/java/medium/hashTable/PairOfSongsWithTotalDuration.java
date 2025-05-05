package medium.hashTable;

public class PairOfSongsWithTotalDuration {
    public int numPairsDivisibleBy60(int[] time) {
        int[] reminders = new int[60];
        int count = 0;
        for(int t: time){
            if(t%60 == 0){
                count += reminders[0];
            }else{
                //(a%60 + b%60) == 60
                int value = 60 - t%60;
                count+= reminders[value];
            }
            reminders[t%60]++;
        }

        return count;
    }
}
