package hard.array;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> answer = new ArrayList<>();
        int i = 0;

        while(i < words.length){
            List<String> currentLine = getWords(words, i, maxWidth);
            i+=currentLine.size();
            answer.add(createLine(i, currentLine, words, maxWidth));
        }

        return answer;
    }

    private String createLine(int i, List<String> currentLine, String[] words, int maxWidth){
        //Calculate extra spaces
        int length = -1;
        for(String word: currentLine){
            length += word.length() + 1;
        }

        int extraSpaces = maxWidth - length;
        //Case where its the last line or only word
        if(i == words.length || currentLine.size() == 1){
            return String.join(" ", currentLine) + " ".repeat(extraSpaces);
        }

        //Or else do left justficiation
        int wordCount = currentLine.size()-1;
        int spacesForWord = extraSpaces/wordCount;
        int needsExtraSpace = extraSpaces % wordCount;

        //Left justification
        for(int j=0; j < needsExtraSpace; j++){
            currentLine.set(j,currentLine.get(j) + " " );
        }

        for(int j=0 ; j < currentLine.size()-1; j++){
            currentLine.set(j, currentLine.get(j) + " ".repeat(spacesForWord));
        }

        return String.join(" ", currentLine);
    }

    private List<String> getWords(String[] words, int i, int maxWidth){
        List<String> wordsInLine = new ArrayList<>();
        int currentLineLen = 0;
        //Getting the words into the line.
        //Check if the next word + currentLineLen is less than equal to maxWidth
        while(i < words.length &&  currentLineLen + words[i].length() <= maxWidth){
            wordsInLine.add(words[i]);
            //This is for the space.
            currentLineLen += words[i].length() + 1;
            i++;
        }

        return wordsInLine;
    }
}
