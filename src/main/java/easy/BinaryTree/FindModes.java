package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModes {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();

        dfs(root, map);

        int maxFreq = Integer.MIN_VALUE;

        for(Integer key : map.keySet()){
            maxFreq = Math.max(maxFreq, map.get(key));
        }

        List<Integer> list = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key) == maxFreq){
                list.add(key);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();


    }

    private void dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        dfs(root.left, map);
        dfs(root.right, map);
    }
}
