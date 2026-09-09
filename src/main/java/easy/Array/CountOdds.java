package easy.Array;

public class CountOdds {
    public int countOdds(int low, int high) {
        int totalNumbers = high - low + 1;

        //If the totalNumbers is even, then there are totalNumbers/2 odd
        //If the totalNumbers is odd, then there are 1 extra, e.g 3,4,5 - totalNumbers/2 = 1 + 1 =  2 odd.
        //TotalNumbers can be odd , if both high and low are odd

        if(low % 2 != 0  && high % 2 != 0 ){
            return totalNumbers/2 + 1;
        }

        return totalNumbers/2;
    }
}
