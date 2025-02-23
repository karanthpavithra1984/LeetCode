package easy.String;

public class VerifyingAnAlienDict {
    public boolean isAlienSorted(String[] words, String order) {
        int[] characters = new int[26];
        for(int i=0;i < order.length();i++){
            characters[order.charAt(i)-'a'] = i;
        }

        for(int i = 0; i < words.length - 1; i++){
            //Lets start with first word and then continue from there
            for(int j = 0; j < words[i].length(); j++){

                if(j >= words[i+1].length()) return false;

                //Compare each character if they are not equal.
                //If you find atleast one non lexographic , then return false,
                // else break,
                //since we dont have to continue with next characters

                if(words[i].charAt(j) != words[i+1].charAt(j)){

                    int charA = words[i].charAt(j) - 'a';
                    int charB = words[i+1].charAt(j) - 'a';

                    if(characters[charA] > characters[charB] ){
                        return false;
                    }

                    //No need to check for next.
                    break;
                }
            }
        }

        return true;
    }
}
