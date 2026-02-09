package medium.twopointers;

public class SortTransformedArray {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        //Parabola, when a < 0  , the largest numbers are in the middle,
        // a >= 0 , the largest numbers are in the edges

        int index = a >= 0 ? nums.length -1 : 0;
        int[] answer = new int[nums.length];
        int start =0, end = nums.length - 1;

        while(start <= end) {
            int numA = transform(nums[start],a,b,c);
            int numB = transform(nums[end],a,b,c);

            if(a >= 0){
                if(numA >= numB){
                    answer[index] = numA;
                    start++;
                }else{
                    answer[index] = numB;
                    end--;
                }
                index--;
            }else{
                if(numA <= numB){
                    answer[index] = numA;
                    start++;
                }else {
                    answer[index] = numB;
                    end--;
                }
                index++;
            }
        }

        return answer;
    }

    private int transform(int num, int a, int b, int c) {
        return a * num * num + b * num + c;
    }
}
