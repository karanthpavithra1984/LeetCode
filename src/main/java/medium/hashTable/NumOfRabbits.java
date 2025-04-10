package medium.hashTable;

import java.util.HashMap;
import java.util.Map;

public class NumOfRabbits {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> groupOfMonkeys = new HashMap<>();
        int sum = 0;
        for(int answer: answers){
            groupOfMonkeys.put(answer, groupOfMonkeys.getOrDefault(answer,0)+1 );

            if(groupOfMonkeys.get(answer) == answer+1){
                sum+= groupOfMonkeys.get(answer);
                groupOfMonkeys.remove(answer);
            }
        }

        for(Integer key: groupOfMonkeys.keySet()){
            sum+= key+1;
        }

        return sum;
    }
}
