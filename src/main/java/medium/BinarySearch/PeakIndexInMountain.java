package medium.BinarySearch;

public class PeakIndexInMountain {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int middle = (right + left) / 2;
            if(arr[middle] > arr[middle - 1] && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if(arr[middle] < arr[middle+1]){
                left = middle;
            }else{
                right = middle;
            }
        }

        return left;
    }
}
