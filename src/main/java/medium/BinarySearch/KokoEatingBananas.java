package medium.BinarySearch;

/**
 * Time Complexity o(logm * n)
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        //There are two ways we can deal with this,
        // One start with a speed of 1 and go until you hit a speed where koko can eat all
        //Bananas within the span of the hours mentioned . And return the minimum speed required
        //Increment speed if the hours exceeds the h mentioned.
        //Now this is linear and it can be maximum pile size (the speed) * number of elements

        //There is another approach that is binary search, we know that if we choose a maximum value,
        //I.e [3,6,7,11] if we choose 11 , the koko can finish it in 4 hrs . However
        //If the current speed is workable,
        // the minimum workable speed should be on its left inclusively. If the current speed is not workable, that is, too slow to finish the eating task,
        // then the minimum workable speed should be on its right exclusively.

        //We need to move the speed , such that we find minimum speed where the koko can eat them all

        //Get the maxSpeed
        int maxSpeed = 0;
        for (int pile : piles)
            maxSpeed = Math.max(maxSpeed, pile);

        int minSpeed = 1; //At the least , koko has to eat 1

        while (minSpeed < maxSpeed) {
            int midSpeed = minSpeed + (maxSpeed - minSpeed) / 2; //To prevent over flow if the maxSpeed is higher

            int hours = 0;
            for (int pile : piles) {
                hours += (int) Math.ceil((double) pile / midSpeed);

                if (hours > h) {
                    break;
                }
            }

            if (hours <= h) {
                //Monkey was able to eat all
                //Find next possible lower speed
                maxSpeed = midSpeed;
            } else {
                //Monkey wasnt able to eat, so increase the speed
                minSpeed = midSpeed + 1;
            }
        }

        return maxSpeed;

    }
}
