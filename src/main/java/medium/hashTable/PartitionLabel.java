package medium.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {
    public List<Integer> partitionLabels(String s) {
        //Get the lastIndex
        Map<Character, Integer> characterIndexMap = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            characterIndexMap.put(s.charAt(i), i);
        }

        int partitionStart = 0 , partitionEnd = 0;
        List<Integer> indexes = new ArrayList<>();
        for(int i =0 ; i < s.length(); i++){
            partitionEnd = Math.max(partitionEnd, characterIndexMap.get(s.charAt(i)));

            //If the partition has ended here , I mean the last Index
            if(i == partitionEnd){
                indexes.add(partitionEnd - partitionStart + 1);
                partitionStart = i+1;
            }
        }

        return indexes;
    }
}
