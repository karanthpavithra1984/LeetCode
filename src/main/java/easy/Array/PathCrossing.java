package easy.Array;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        int x = 0, y = 0;

        for (Character character : path.toCharArray()) {
            switch (character) {
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
            }

            String pos = x + "," + y;
            if (visited.contains(pos)) {
                return true;
            }

            visited.add(pos);
        }

        return false;
    }
}
