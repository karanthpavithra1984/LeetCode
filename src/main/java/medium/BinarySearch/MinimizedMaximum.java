package medium.BinarySearch;

public class MinimizedMaximum {
    public int minimizedMaximum(int n, int[] quantities) {
        int minimumNumber = 1;
        int maximumNumber = 0;

        for(int quantity: quantities){
            maximumNumber = Math.max(maximumNumber, quantity);
        }

        while(minimumNumber < maximumNumber){
            int midNumber = minimumNumber + (maximumNumber - minimumNumber)/2;

            int numberofRetails = 0;
            for(int quantity: quantities){
                numberofRetails += Math.ceil((double) quantity/midNumber);

                if(numberofRetails > n){
                    break;
                }
            }

            if(numberofRetails > n){
                //We need to increase the spread
                //Numbers are not enough, we need to go on the higher end
                minimumNumber = midNumber + 1;
            }else{
                maximumNumber = midNumber;
            }
        }

        return maximumNumber;
    }
}
