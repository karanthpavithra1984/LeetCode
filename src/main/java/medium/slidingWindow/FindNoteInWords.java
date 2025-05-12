package medium.slidingWindow;

public class FindNoteInWords {
    public String findNote(String[] words, String note) {
        int[] noteArray = new int[26];

        for (Character character : note.toCharArray()) {
            noteArray[character - 'a']++;
        }

        String transformedNote = transformString(noteArray);

        for (String word : words) {
            int[] wordArray = new int[26];
            for (Character character : word.toCharArray()) {
                wordArray[character - 'a']++;
            }

            if (transformedNote.contains(transformString(wordArray))) {
                return word;
            }
        }

        return "-";
    }

    private String transformString(int[] charArray) {
        StringBuilder transString = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 0) {
                transString.append((char) (i + 'a'));
                transString.append(charArray[i]);
            }
        }

        return transString.toString();
    }
}
