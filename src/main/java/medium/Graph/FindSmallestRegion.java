package medium.Graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSmallestRegion {
    public String findSmallestRegion(List<List<String>> regions,
                                     String region1, String region2) {

        Map<String, String> parentMap = new HashMap<>();

        for(List<String> region : regions) {
            String parent = region.get(0);
            for (int i = 1; i < region.size(); i++) {
                parentMap.put(region.get(i), parent);
            }
        }

        // Create a path for each region to the root
        List<String> path1 = getPathToRoot(parentMap, region1);
        List<String> path2 = getPathToRoot(parentMap, region2);

        //Now find the lowest Common ancestor

        String smallestRegion = null;

        int i = 0, j = 0;

        while (i < path1.size() && j < path2.size()) {
            if (path1.get(i).equals(path2.get(j))) {
                smallestRegion = path1.get(i);
                i++;
                j++;
            } else {
                break;
            }
        }

        return smallestRegion;

    }

    private List<String> getPathToRoot(Map<String, String> parentMap, String region) {
        List<String> path = new java.util.ArrayList<>();
        while (region != null) {
            path.add(region);
            region = parentMap.get(region);
        }
         Collections.reverse(path);

        return path;
    }
}
