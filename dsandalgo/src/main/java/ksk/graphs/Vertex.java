package ksk.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;
    private boolean beingVisited;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public boolean isIsvisited() {
        return visited;
    }

    public void setIsvisited(boolean isvisited) {
        this.visited = isvisited;
    }

    public void addNeighbour(Vertex vertex) {
        adjacencyList.add(vertex);
    }

    public void showNeighbours() {
        for (Vertex vertex : adjacencyList) {
            System.out.println(vertex);
        }
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    @Override
    public String toString() {
        return name;

    }

}
