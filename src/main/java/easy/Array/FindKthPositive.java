package easy.Array;

public class FindKthPositive {
    //Check leet code for understanding this problem.
    //Definetly not easy
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) /2;
            if(arr[mid]-mid-1 < k){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return left+k;
    }
}
