package easy.String;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        boolean firstLetter = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                if(i == 0)
                    firstLetter = true;
                cap++;
            }
        }

        return cap == word.length() || cap == 0 || (firstLetter && cap == 1);
    }
}
