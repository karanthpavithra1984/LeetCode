package medium.twopointers;

public class AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        char[] result = new char[s.length() +  spaces.length];

        int spaceIndex  = 0;
        int writeIndex  = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(spaceIndex < spaces.length && i == spaces[spaceIndex]){
                result[writeIndex++] = ' ';
                spaceIndex++;
            }

            result[writeIndex++] = s.charAt(i); //add character
        }

        return new String(result);
    }
}
