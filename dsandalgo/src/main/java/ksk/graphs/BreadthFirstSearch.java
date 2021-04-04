package ksk.graphs;

/*

We have a graph and we want to visit every node : we can do with BFS
The aim is to visit every vertex exactly once
Running complexity --> o(v+e)
Memory complexity is not good because we have to store lots of references
Advantage of BFS is - shortest path, Dijkstra's algorithm - Does a breath-first search if all the edge weights are equal to 1

Use-case : The main purpose of this Breadth first search is, just visit every node @ one time

 */


import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    static void findOutBFS(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setIsvisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println("Vertex-- " + actualVertex.getName());
            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isIsvisited()) {
                    v.setIsvisited(true);
                    queue.add(v);
                }

            }
        }
    }


    public static void main(String args[]) {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");

        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);

        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);

        c.addNeighbour(b);

        d.addNeighbour(b);
        d.addNeighbour(e);

        f.addNeighbour(a);

        g.addNeighbour(a);
        g.addNeighbour(h);

        h.addNeighbour(g);

        breadthFirstSearch.findOutBFS(a);

    }


}