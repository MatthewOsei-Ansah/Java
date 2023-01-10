package hashing;

public class Main {
    public static void main(String[] args) {
        Hashing<Character> hashing = new Hashing<>();

        // Initial Setup
        hashing.addNode('A');
        hashing.addNode('B');
        hashing.addNode('C');
        hashing.addNode('D');
        hashing.addNode('E');
        hashing.addNode('F');
        hashing.addNode('G');

        // Node A Connection Setup
        hashing.addConnection('A', 'B', 5);
        hashing.addConnection('A','D', 8);
        hashing.addConnection('A', 'E', 4);

        // Node B Connection Setup
        hashing.addConnection('B', 'C', 4);

        //Node C Setup
        hashing.addConnection('C', 'D', 5);
        hashing.addConnection('C', 'G', 2);

        // Node E Setup
        hashing.addConnection('D', 'E', 7);
        hashing.addConnection('D', 'F',6);

        // Other Stuff
        System.out.println(hashing.Display());

    }
}
