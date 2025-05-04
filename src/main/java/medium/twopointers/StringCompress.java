package medium.twopointers;

public class StringCompress {
    /**
     * Time Complexity o(n)
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        int arrayIndex = 0 , leftIndex = 0;

        while(leftIndex < chars.length){
            int counter = 1;
            char character = chars[leftIndex];

            while(leftIndex+1 < chars.length && chars[leftIndex + 1] == character){
                counter++;
                leftIndex++;
            }

            leftIndex++;
            chars[arrayIndex] = character;
            arrayIndex++;

            if(counter > 1){
                for(char c: (counter +"").toCharArray()){
                    chars[arrayIndex] = c;
                    arrayIndex++;
                }
            }
        }

        return arrayIndex;
    }
}
