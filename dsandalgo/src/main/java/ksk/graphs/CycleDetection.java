package ksk.graphs;

import java.util.List;

public class CycleDetection {


    public void detectCycle(List<Vertex> vertexList) {

        for (Vertex vertex : vertexList) {

            if (!vertex.isIsvisited()) {
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex) {

        System.out.println("DFS on vertex " + vertex);
        vertex.setBeingVisited(true);

        for (Vertex v : vertex.getAdjacencyList()) {

            System.out.println("Visiting the neighbours of vertex " + vertex);
            if (v.isBeingVisited()) {
                System.out.println("Backward edge ... so there is a cycle-->" + v.getName());
                return;
            }

            if (!v.isIsvisited()) {
                System.out.println("visiting vertex " + v + "recursively...");
                v.setIsvisited(true);
                dfs(v);
            }
        }

        System.out.println("Set vertex " + vertex + " setBeingVisited(false) and visited(true)");
        vertex.setBeingVisited(false);
        vertex.setIsvisited(true);

    }
}
