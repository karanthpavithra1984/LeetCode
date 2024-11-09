package medium.Stack;

import java.util.Stack;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] splitPaths = path.split("/");
        Stack<String> directories = new Stack<>();
        for(String splitPath: splitPaths){
            if(splitPath.equals("..")){
                if(!directories.isEmpty()) directories.pop();
            }else if(!splitPath.isEmpty() && !splitPath.equals(".")) {
                directories.push(splitPath);
            }
        }

        StringBuilder builder = new StringBuilder();

        for(String directory: directories){
            builder.append("/").append(directory);
        }

        return builder.length() > 0  ? builder.toString() : "/";
    }
}
