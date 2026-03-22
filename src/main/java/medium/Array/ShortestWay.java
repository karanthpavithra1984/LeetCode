package medium.Array;

public class ShortestWay {
    public int shortestWay(String source, String target) {
        boolean[] sourceChars = new boolean[26];
        for (int i = 0; i < source.length(); i++) {
            sourceChars[source.charAt(i) - 'a'] = true;
        }

        boolean[] targetChars = new boolean[26];
        for (int i = 0; i < target.length(); i++) {
            if (!sourceChars[target.charAt(i) - 'a']) {
                return -1;
            }
        }

        int sourceIterator = 0;
        int counter = 0;
        for (int i = 0; i < target.length(); i++) {

            if (sourceIterator == 0) {
                counter++;
            }

            while (source.charAt(sourceIterator) != target.charAt(i)) {
                sourceIterator = (sourceIterator + 1) % source.length(); //Reset to start;

                if (sourceIterator == 0) {
                    counter++;
                }
            }

            sourceIterator = (sourceIterator + 1) % source.length();
        }
        return counter;
    }
}
