package easy.prefixSum;

public class MaximumPopulation {

    /**
     * Basically you need to calculate the max population or  maximum number of people alive at a particular year and return the early year
     * Time Complexity o(n) where n is the logs or o(1) where 1 because 101 times
     * Space is o(1)
     * @param logs
     * @return
     */
    public int maximumPopulation(int[][] logs) {
        //Year 1950-2050
        int[] population = new int[101];

        for(int[] log: logs){
            population[log[0]-1950]++;
            population[log[1]-1950]--;
        }

        int max = population[0];
        int result = 1950;

        for(int i=1; i < 101;i++){
            population[i] += population[i-1];
            if(population[i] > max){
                max = population[i];
                result = i + 1950;
            }
        }

        return result;

    }
}
