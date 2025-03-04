package medium.twopointers;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        /**
         * We can go with Hashmap approach where we can save the id
         * in a treemap , since the results needs to be sorted
         * Sorting is NLOGN ,in this case its going to be N1+N2 log(n1+n2)
         *
         * However we can leverage the ascending nature of the unique ids in the
         * input array and use two pointers
         */

        int p1 = 0 ;int p2 = 0;

        List<int[]> result = new ArrayList<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1][0] == nums2[p2][0]) {
                result.add(new int[]{nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
                p1++;
                p2++;
            }else if(nums1[p1][0] < nums2[p2][0]) {
                //Just add them
                result.add(new int[]{nums1[p1][0], nums1[p1][1]});
                p1++;
            }else{
                result.add(new int[]{nums2[p2][0], nums2[p2][1]});
                p2++;
            }
        }

        while(p1 < nums1.length) {
            result.add(new int[]{nums1[p1][0], nums1[p1][1]});
            p1++;
        }

        while(p2 < nums2.length) {
            result.add(new int[]{nums2[p2][0], nums2[p2][1]});
            p2++;
        }
        return result.toArray(new int[result.size()][]);

    }
}
