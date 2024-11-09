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
        String newPath = "/";
        for(String splitPath: splitPaths){
            if(splitPath.equals("..")){
                if(!directories.isEmpty()) directories.pop();
            }else if(!splitPath.isEmpty() && !splitPath.equals(".")) {
                directories.push(splitPath);
            }
        }

        for(String directory: directories){
            newPath += directory + "/";
        }

        return newPath == "/" ? newPath : newPath.substring(0, newPath.length()-1);
    }
}
