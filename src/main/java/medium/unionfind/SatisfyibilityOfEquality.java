package medium.unionfind;

import utils.UnionFind;

public class SatisfyibilityOfEquality {
    public boolean equationsPossible(String[] equations) {
        //Initialize Union Find
        UnionFind unionFind = new UnionFind(26);

        //Union all the equalities first
        for (String equation : equations) {
            char[] chars = equation.toCharArray();
            int x = chars[0] - 'a';
            int y = chars[3] - 'a';

            if (chars[1] == '=') {
                unionFind.union(x,y);
            }
        }

        for (String equation : equations) {
            char[] chars = equation.toCharArray();
            int x = chars[0] - 'a';
            int y = chars[3] - 'a';

            if (chars[1] == '!') {
                if (unionFind.findParent(x) == unionFind.findParent(y)) {
                    return false;
                }
            }
        }

        return true;
    }
}
