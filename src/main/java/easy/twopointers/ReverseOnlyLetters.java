package easy.twopointers;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] values = new char[s.length()];

        while (left <= right) {
            if(Character.isLetter(s.charAt(left)) && Character.isLetter(s.charAt(right))) {
                values[left] = s.charAt(right);
                values[right] = s.charAt(left);
                left++;
                right--;
            }else if(!Character.isLetter(s.charAt(left))) {
                values[left] = s.charAt(left);
                left++;
            }else if(!Character.isLetter(s.charAt(right))) {
                values[right] = s.charAt(right);
                right--;
            }
        }

        return new String(values);
    }
}
