package hard.unionfind;

import utils.UnionFind;

public class FriendRequests {
    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        UnionFind unionFind = new UnionFind(n);
        boolean[] result = new boolean[requests.length];

        for (int i = 0; i < requests.length; i++) {
            if (clearRestrictions(unionFind, requests[i][0], requests[i][1], restrictions)) {
                unionFind.union(requests[i][0], requests[i][1]);
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }

    private boolean clearRestrictions(UnionFind unionFind, int node1, int node2, int[][] restrictions) {
        int par1 = unionFind.findParent(node1);
        int par2 = unionFind.findParent(node2);

        for (int[] restriction : restrictions) {
            int rest1 = unionFind.findParent(restriction[0]);
            int rest2 = unionFind.findParent(restriction[1]);

            if (rest1 == par1 && rest2 == par2)
                return false;
            if (rest1 == par2 && rest2 == par1)
                return false;
        }

        return true;
    }
}
