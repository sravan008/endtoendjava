package ksk.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopoligicalSort {

    private Stack<Vertex> stackVertex;

    TopoligicalSort() {
        this.stackVertex = new Stack<>();
    }

    public void dfs(Vertex v) {
        v.setIsvisited(true);
        for (Vertex vertex : v.getAdjacencyList()) {
            if (!vertex.isIsvisited()) {
                vertex.setIsvisited(true);
                dfs(vertex);
            }
        }
        stackVertex.push(v);
    }

    public Stack<Vertex> getStack() {
        return this.stackVertex;
    }


    public static void main(String[] args) {

        TopoligicalSort topoligicalSort = new TopoligicalSort();

        List<Vertex> graph = new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));


        graph.get(2).addNeighbour(graph.get(3));
        graph.get(3).addNeighbour(graph.get(1));

        graph.get(4).addNeighbour(graph.get(0));
        graph.get(4).addNeighbour(graph.get(1));

        graph.get(5).addNeighbour(graph.get(0));
        graph.get(5).addNeighbour(graph.get(2));

        for (int i = 0; i < graph.size(); i++) {
            if (!graph.get(i).isIsvisited()) {
                topoligicalSort.dfs(graph.get(i));
            }
        }
        Stack<Vertex> stack = topoligicalSort.getStack();
        for (int i = 0; i < graph.size(); i++) {
            Vertex vertex = stack.pop();
            System.out.println(vertex.getName());
        }
    }
}