package easy.twopointers;

public class DietPlanPerformance {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += calories[i];
        }

        int counter = 0;

        for(int i = k; i < calories.length; i++) {
            if(sum < lower){
                counter--;
            }else if(sum > upper){
                counter++;
            }

            sum +=  calories[i] - calories[i-k];
        }

        if(sum < lower){
            counter--;
        } else if(sum > upper){
            counter++;
        }

        return counter;
    }
}
