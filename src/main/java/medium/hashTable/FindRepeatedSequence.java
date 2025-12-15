package medium.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepeatedSequence {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> output = new HashSet<>();

        for(int i=0 ; i < s.length()-10+1; i++){
            String subStr = s.substring(i, i+10);
            if(set.contains(subStr)){
                output.add(subStr);
            }
            set.add(subStr);
        }

        return new ArrayList<>(output);
    }
}
