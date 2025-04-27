package hard.dp.BinaryTree;

import org.apache.commons.lang3.tuple.Pair;
import utils.TreeNode;

import java.util.*;

/**
 * o(N*(LOG N/K))
 */

public class VerticalOrderTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // This will hold the columnNumber and the list of the values which is basically row and column, since we need to sort them
        Map<Integer,List<Pair<Integer,Integer>>> columnMap = new HashMap<>();
        Queue<Pair<TreeNode, Pair<Integer, Integer>>> queue = new LinkedList<>();

        queue.offer(Pair.of(root, Pair.of(0,0)));
        int minValue = 0 ;
        int maxValue = 0 ;

        while (!queue.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> pair = queue.poll();
            TreeNode node = pair.getKey();
            int row = pair.getValue().getKey();
            int col = pair.getValue().getValue();

            if(node != null) {
                if (!columnMap.containsKey(col)) {
                    columnMap.put(col, new ArrayList<>());
                }

                columnMap.get(col).add(Pair.of(row, node.val));


                minValue = Math.min(minValue, col);
                maxValue = Math.max(maxValue, col);

                queue.offer(Pair.of(node.left,Pair.of(row+1, col - 1)));
                queue.offer(Pair.of(node.right, Pair.of(row+1, col + 1)));
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        System.out.println(minValue +"," + maxValue);
        for(int i= minValue; i<= maxValue; i++){
            Collections.sort(columnMap.get(i), (o1, o2) -> {
                if(o1.getKey().equals(o2.getKey())){
                    return o1.getValue()- o2.getValue();
                }else{
                    return o1.getKey()- o2.getKey();
                }
            });

            List<Integer> values = new LinkedList<>();
            for(Pair<Integer, Integer> pair : columnMap.get(i)){
                values.add(pair.getValue());
            }

            result.add(values);
        }

        return result;
    }
}
