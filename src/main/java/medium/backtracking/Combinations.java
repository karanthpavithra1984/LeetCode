package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    /**
     * Time Complexity o(k* !n/!k * !n-k) = o(k, c(n,k)) - c(n,k) -> Combination
     * Space Complexity o(k) - combination excluding the result
     * @param n
     * @param k
     * @return
     */
    private int counter = 0;
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(n, 1, k, res, combination);
        System.out.println("Combinations" + counter);
        return res;
    }

    private void backtrack(int n, int index, int k, List<List<Integer>> res, List<Integer> combination) {
        System.out.println(combination);
        if(combination.size() == k) {
            res.add(new ArrayList<>(combination));
            return;
        }

        System.out.println(combination.size());
        //Depending upon the size of the combination , you are figuring out remaining elements
        // If the size is 0, i.e it hasnt even started traversing, if the k = 2 , then 6,7 is the last combination.
        //you can skip 7 and hence the remaining is 6 , and you traverse through 1-> 6
        int remaining = n - (k-combination.size()) + 1;

        for(int i = index; i <= remaining; i++) {
            System.out.println("index " + i + "," + remaining);
            counter++;
            combination.add(i);
            backtrack(n, i + 1, k, res, combination);
            System.out.println("i here " + i);
            combination.remove(combination.size()-1);
        }
    }

}
