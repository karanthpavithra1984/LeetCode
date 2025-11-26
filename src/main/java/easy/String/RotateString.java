package easy.String;

public class RotateString {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;
        String concatString = s + s ;

        return concatString.contains(goal);
    }
}
