package easy.Array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();

        for (Integer num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> nums2Set = new HashSet<>();
        for (Integer num : nums2) {
            nums2Set.add(num);
        }

        List<Integer> values1 = new LinkedList<>();
        for (Integer num : nums1Set) {
            if (!nums2Set.contains(num)) {
                values1.add(num);
            }
        }

        List<Integer> values2 = new LinkedList<>();
        for (Integer num : nums2Set) {
            if (!nums1Set.contains(num)) {
                values2.add(num);
            }
        }

        List<List<Integer>> arrayList = new LinkedList<>();

        arrayList.add(values1);
        arrayList.add(values2);

        return arrayList;
    }
}
