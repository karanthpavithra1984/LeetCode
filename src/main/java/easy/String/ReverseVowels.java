package easy.String;

public class ReverseVowels {
    private final static String VOWELS = "aeiouAEIOU";
    public String reverseVowels(String s) {
        char[] stringChars = s.toCharArray();
        Integer leftVowelIndex = -1, rightVowelIndex = -1;

        int leftIndex = 0, rightIndex = stringChars.length - 1;
        while(leftIndex < rightIndex) {
            if(VOWELS.contains("" + s.charAt(leftIndex))) {
                leftVowelIndex = leftIndex;
            }
            if(VOWELS.contains("" + s.charAt(rightIndex))) {
                rightVowelIndex = rightIndex;
            }

            if(leftVowelIndex > -1 && rightVowelIndex > -1){
                char temp = stringChars[leftVowelIndex];
                stringChars[leftVowelIndex] = stringChars[rightVowelIndex];
                stringChars[rightVowelIndex] = temp;
                leftVowelIndex = -1;
                rightVowelIndex = -1;
            }

            if(leftVowelIndex == -1)leftIndex++;
            if(rightVowelIndex == -1) rightIndex--;
        }

        return new String(stringChars);
    }


}
