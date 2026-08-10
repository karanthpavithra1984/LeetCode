package medium.Array;

public class BestClosingTime {
    public int bestClosingTime(String customers) {
        int maxScore = 0 , currentScore = 0, timeClose = 0;

        for(int i=0; i < customers.length(); i++){
            char ch = customers.charAt(i);
            //use score , if its open at ith hour , then increase the score
            if(ch == 'Y'){
                currentScore++;
            }else{
                currentScore--;
            }

            if(currentScore > maxScore){
                //Better to close it
                maxScore = currentScore;
                timeClose = i + 1;
            }
        }

        return timeClose;
    }
}
