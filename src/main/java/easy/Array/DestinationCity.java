package easy.Array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> outGoing = new HashSet<>();
        for(int i=0; i< paths.size(); i++){
            outGoing.add(paths.get(i).get(0));
        }

        for(int i=0; i< paths.size(); i++){
            if(!outGoing.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }

        return "";

    }
}
