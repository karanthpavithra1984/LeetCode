package easy.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FindBuildings {

    //Time Complexity -o(n)
    //Stack push and pop is o(1)
    //While loop be bigger if the buildings are 4,1,2,3 in the worstcase
    // which would be one time , so amortized time would be constant
    //Linkedlist addFirst is o(1)
    //Space complexity is building the stack and indexList which would be used to send the data back
    public int[] findBuildings(int[] heights) {
        //Start from the right side
        Stack<Integer> buildings = new Stack<>();
        List<Integer> indexList = new LinkedList<>();

        for(int i = heights.length - 1; i >= 0; i--){
            while(!buildings.isEmpty() && heights[i] > buildings.peek()){
                buildings.pop();
            }

            //Push if the buildings are empty
            if(buildings.isEmpty()) {
                indexList.addFirst(i);
            }
            //Lets push to the stack
            buildings.push(heights[i]);
        }

        return indexList.stream().mapToInt(i -> i).toArray();
    }
}
