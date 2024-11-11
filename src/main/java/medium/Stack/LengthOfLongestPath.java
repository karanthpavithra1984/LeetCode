package medium.Stack;

import java.util.Stack;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(n)
 */


public class LengthOfLongestPath {
    public int lengthLongestPath(String input) {
        String[] filePaths = input.split("\n");

        Stack<String> files = new Stack<>();
        int maxLength = 0;

        for(String filePath : filePaths){
            int lastIndex = filePath.lastIndexOf("\t");
            //Make sure the number of \t is greater than previous \t
            //this is basically moving up if the dead end is hit or if its the end of the path
            while(!files.isEmpty() && lastIndex < files.size() - 1){
                files.pop();
            }
            if(filePath.contains("\t")){
                filePath = filePath.replaceAll("\t", "");
            }

            files.push(filePath);

            if(filePath.contains(".")){
                int length = 0;
                for(String file: files){
                    length += file.length() + 1;
                }

                maxLength = Math.max(maxLength, length - 1); // Last "/"
            }
        }

        return maxLength;
    }
}
