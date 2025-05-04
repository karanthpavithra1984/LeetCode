package easy.String;

public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] lowerCase = new int[26];

        for(Character character: chars.toCharArray()){
            lowerCase[character-'a']++;
        }

        int counter = 0;
        boolean charNotFound = false;
        for(String word: words){
            charNotFound = false;
            int[] wordArray = new int[26];
            for(Character character : word.toCharArray()){
                wordArray[character-'a']++;
            }

            for(int i=0 ; i < 26; i++){
                if(wordArray[i] > lowerCase[i]){
                    charNotFound=true;
                    break;
                }
            }

            if(!charNotFound) counter+= word.length();
        }

        return counter;
    }



}
