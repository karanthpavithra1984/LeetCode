package medium.Array;

public class SortColors {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];

        for(int num: nums){
            colors[num]++;
        }

        int j = 0;

        for(int i=0; i < colors.length; i++){
            for(int k=0; k< colors[i];k++){
                nums[j] = i;
                j++;
            }
        }
    }
}
