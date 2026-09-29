package medium.Array;

public class HitCounter {

        private final int N = 300;
        private int[] times ;
        private int[] hits;

        public HitCounter() {
            times = new int[N];
            hits = new int[N];
        }

        public void hit(int timestamp) {
            int index = timestamp % N;

            //Might have some stale or first hit
            if( times[index] != timestamp ){
                times[index] = timestamp;
                hits[index] = 1;
            }else{
                hits[index]++;
            }

        }

        public int getHits(int timestamp) {
            int sum = 0;

            for(int i= 0; i < N; i++){
                if(timestamp - times[i] < N ){
                    sum += hits[i];
                }
            }

            return sum;
        }

}
