package easy.String;

public class MakeSmallestPalindrome {
    private char[] chars;
    public String makeSmallestPalindrome(String s) {
        int left = 0 , right = s.length()-1;
        chars = s.toCharArray();

        while(left <= right){
            if(chars[left] !=  chars[right]){
                swap(left, right);
            }

            left++;
            right--;
        }

        return new String(chars);
    }

    private void swap(int left, int right){
        char smallest = chars[left] < chars[right] ? chars[left] : chars[right];
        chars[left] = chars[right] = smallest;
    }

}
