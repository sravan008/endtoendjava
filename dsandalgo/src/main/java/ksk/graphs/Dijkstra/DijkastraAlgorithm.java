package ksk.graphs.Dijkstra;

import java.util.PriorityQueue;


public class DijkastraAlgorithm {

    public void computePath(Vertex sourceVertex){

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueues = new PriorityQueue<>();
        priorityQueues.add(sourceVertex);

        while (!priorityQueues.isEmpty()){

            Vertex acVertex = priorityQueues.poll();
            for (Edge edge: acVertex.getAdjencyList()){

                Vertex vertex = edge.getTargetVertex();
                double newDistance = acVertex.getDistance() +edge.getWeight();


            }

        }



    }



}
