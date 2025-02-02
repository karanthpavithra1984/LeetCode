package medium.Array;

public class ReorganizeStrings {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int maxFrequency = 0;
        int letter = 0;
        for(Character c : s.toCharArray()) {
            count[c - 'a']++;
            int frequency = count[c - 'a'];
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                letter = c - 'a';
            }
        }

        if(maxFrequency > (s.length()+1)/2) return "";

        char[] returnArray = new char[s.length()];

        int index = 0;
        //Place the most frequent characters first
        while(count[letter] != 0){
            returnArray[index] = (char)(letter + 'a');
            index+=2;
            count[letter]--;
        }

        for(int i = 0 ; i < count.length; i++){
            if(i != letter && count[i] > 0){
                while(count[i] !=0 ){
                    if(index > s.length()-1){
                        index = 1;
                    }
                    returnArray[index] = (char)(i + 'a');
                    index+=2;
                    count[i]--;
                }
            }
        }
        return new String(returnArray);
    }

}
