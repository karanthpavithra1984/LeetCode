package medium.String;

public class OneEditString {
    public boolean isOneEditDistance(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        //Very smart of people :)
        if (sLen > tLen) return isOneEditDistance(t, s);

        //If the sLen is more than 1 greater than tLen
        if ((tLen - sLen) > 1) return false;


        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (sLen == tLen) {
                    //adb and acb , although c and d are not equal,
                    // since lengths are same , you can just if the next part of string is equal
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else {
                    // ac and abc
                    // the current and next character should be same.
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }

        return (tLen - sLen) == 1;

    }
}
