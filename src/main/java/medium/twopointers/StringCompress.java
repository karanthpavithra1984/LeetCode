package medium.twopointers;

public class StringCompress {
    /**
     * Time Complexity o(n)
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        int arrayIndex = 0;
        int leftPointer = 0;

        while(leftPointer < chars.length) {
            char character = chars[leftPointer];
            int counter = 1;

            while(leftPointer < chars.length-1 && character == chars[leftPointer + 1]) {
                counter++;
                leftPointer++;
            }

            leftPointer++;
            chars[arrayIndex++] = character;

            if(counter > 1){
                for(char c: Integer.toString(counter).toCharArray()){
                    chars[arrayIndex++] = c;
                }
            }
        }

        return arrayIndex;
    }
}
