package ksk.graphs.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private List<Edge> adjencyList;
    private boolean visited;
    private Vertex previousVertex;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjencyList = new ArrayList<>();
    }


    public void addNeighbour(Edge edge) {
        adjencyList.add(edge);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", adjencyList=" + adjencyList +
                ", visited=" + visited +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjencyList() {
        return adjencyList;
    }

    public void setAdjencyList(List<Edge> adjencyList) {
        this.adjencyList = adjencyList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double minDistance) {
        this.distance = minDistance;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.distance);
    }
}