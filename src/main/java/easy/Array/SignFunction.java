package easy.Array;

public class SignFunction {
    public int arraySign(int[] nums) {
        int negativeSign = 0;

        for(int i=0; i < nums.length; i++ ){
            if(nums[i] == 0){
               return 0;
            }else if(nums[i] < 0){
                negativeSign++;
            }
        }

        if(negativeSign % 2 == 0){
            return 1;
        }else{
            return -1;
        }
    }
}
