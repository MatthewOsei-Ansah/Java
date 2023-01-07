import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");


        // Node A Setup
        graph.addConnection("A", "B", 5);
        graph.addConnection("A","D", 8 );
        graph.addConnection("A", "E", 4);

        // Node B Setup
        graph.addConnection("B", "C", 4);

        // Node C Setup
        graph.addConnection("C", "D", 5);
        graph.addConnection("C", "G", 2);

        // Node D Setup
        graph.addConnection("D", "E", 7);
        graph.addConnection("D","F", 6);

        // Node E Setup

        // Node F Setup

        // Node G Setup

        // Displaying Result
        graph.DisplayConnections();
    }
}
