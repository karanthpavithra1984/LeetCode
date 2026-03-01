package medium.twopointers;

public class LongestMountain {
    public int longestMountain(int[] arr) {
        int base = 0, N = arr.length, end = 0, ans = 0;

        while(base < N){
            end = base;
            if(end < N-1 && arr[end] < arr[end+1]){
                //Increment the end until peak is hit
                while(end < N-1 && arr[end] < arr[end+1]) end++;

                //If really pick ?
                if(end < N-1 && arr[end] > arr[end+1]){
                    while(end < N-1 && arr[end] > arr[end+1]) end++;

                    ans = Math.max(ans, end - base + 1);
                }

            }

            base = Math.max(end , base + 1);
        }

        return ans;
    }
}
