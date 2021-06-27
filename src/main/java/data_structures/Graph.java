package data_structures;

import java.util.LinkedList;

public class Graph {
    int vertexCount;
    LinkedList<Integer> adjListArray[];

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjListArray = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adjListArray[source].add(destination);
        adjListArray[destination].add(source);
    }

    void printGraph() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print("Adjacent list of vertex " + i + ": ");
            for (Integer integer : adjListArray[i]) {
                System.out.print("-> " + integer);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();

    }
}
