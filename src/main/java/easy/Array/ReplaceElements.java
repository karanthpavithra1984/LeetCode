package easy.Array;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        //Start from the last element
        int maxR = -1;

        for(int i=arr.length-1; i>=0 ; i--){
            int temp = arr[i];
            arr[i] = maxR;
            maxR = Math.max(maxR, temp);
        }

        return arr;
    }
}
