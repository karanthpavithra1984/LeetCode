package easy.twopointers;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int low = 0, N = s.length(), high = N;
        int[] arr = new int[N + 1];
        for(int i = 0 ; i < N ; i++){
            if(s.charAt(i) == 'I') {
                arr[i] = low;
                low++;
            }else{
                arr[i] = high;
                high--;
            }
        }

        arr[N] = low;

        return arr;
    }
}
