package medium.Graph;

import utils.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    Map<GraphNode, GraphNode> visited = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) return node;

        //Make sure we dont go to loop and add duplicate things.
        if (visited.containsKey(node)) return visited.get(node);

        GraphNode cloneNode = new GraphNode(node.val, new ArrayList<>());
        visited.put(node, cloneNode);

        for (GraphNode node1 : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(node1));
        }

        return cloneNode;

    }
}
