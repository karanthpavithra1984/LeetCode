package easy.Graph;

public class TownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] indegrees = new int[n+1];
        int[] outdegrees = new int[n+1];

        for(int[] tr : trust){
            //1 -> 3
            outdegrees[tr[0]]++; // e.g 1
            indegrees[tr[1]]++; // 3
        }

        for(int i = 1; i<=n ; i++){
            // all trusts the judge and judge doesnt trust anyone
            if(indegrees[i] == n-1 && outdegrees[i] == 0){
                return i;
            }
        }

        return -1;
    }
}
