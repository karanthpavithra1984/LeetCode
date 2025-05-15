package medium.Array;

public class CarPool {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timeStamp = new int[1001];
        for (int[] trip : trips) {
            timeStamp[trip[1]] += trip[0];
            //Reduce the time since the trip ended.
            timeStamp[trip[2]] -= trip[0];
        }
        int numCapacity = 0;
        for (int i = 0; i < timeStamp.length; i++) {
            numCapacity += timeStamp[i];
            if (numCapacity > capacity)
                return false;
        }

        return true;
    }
}
