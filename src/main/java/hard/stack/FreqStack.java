package hard.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {
    Map<Integer,Integer> frequencyMap;
    Map<Integer, Stack<Integer>> maxFrequencyStack;
    int maxFrequency;

    public FreqStack() {
        this.frequencyMap = new HashMap<>();
        this.maxFrequencyStack = new HashMap<>();
        this.maxFrequency = 0;
    }

    public void push(int val) {
        frequencyMap.put(val, frequencyMap.getOrDefault(val,0)+1);
        int count = frequencyMap.get(val);

        if(count > maxFrequency){
            maxFrequency = count;
        }

        if(!maxFrequencyStack.containsKey(count)){
            maxFrequencyStack.put(count, new Stack<>());
        }

        maxFrequencyStack.get(count).push(val);
    }

    public int pop() {
        Stack<Integer> maxValues = maxFrequencyStack.get(maxFrequency);
        int popped = maxValues.pop();

        if(frequencyMap.containsKey(popped)){
            frequencyMap.put(popped, frequencyMap.get(popped)-1);
        }

        if(maxFrequencyStack.get(maxFrequency).isEmpty()){
            maxFrequency--;
        }
        return popped;
    }
}
