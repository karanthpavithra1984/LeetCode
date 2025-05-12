package easy.String;

public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        //If str1 is LEET and str2 is CODE, then they definetly wont have GCD
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int longLength = str1.length();
        int smallLength = str2.length();

        int gcdLength = recursiveGcd(longLength, smallLength);
        return str1.substring(0, gcdLength);
    }

    private int recursiveGcd(int longLength, int smallLength) {
        if (smallLength == 0) {
            return longLength;
        }

        return recursiveGcd(smallLength, longLength % smallLength);

    }
}
