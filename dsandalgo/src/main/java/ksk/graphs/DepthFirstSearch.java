package ksk.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {


    static void findOutDfs(Vertex root) {

        Stack<Vertex> stack = new Stack<>();
        root.setIsvisited(true);
        stack.push(root);
        while (!stack.empty()) {

            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex.getName());

            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isIsvisited()) {
                    v.setIsvisited(true);
                    stack.push(v);
                }
            }
        }
    }


    void dfsWithRecurssion(Vertex v) {
        v.setIsvisited(true);
        System.out.println(v);
        for (Vertex vertex : v.getAdjacencyList()) {
            if (!vertex.isIsvisited()) {
                vertex.setIsvisited(true);
                dfsWithRecurssion(vertex);
            }
        }
    }


    public static void main(String[] args) {

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

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


        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        List<Vertex> vertices = new ArrayList<>();

        v1.addNeighbour(v2);
        v1.addNeighbour(v3);
        v2.addNeighbour(v6);
        v3.addNeighbour(v4);
        v4.addNeighbour(v5);

        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);
        vertices.add(v5);


        // depthFirstSearch.findOutDfs(a);
        //depthFirstSearch.findOutDfs(v1);
        depthFirstSearch.dfsWithRecurssion(v1);


    }


}
