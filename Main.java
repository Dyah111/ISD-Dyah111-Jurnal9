public class Main {
    public static void main(String[] args) {
        Adjacency Matrix = new Adjacency(9);
        Matrix.addEdge(0, 1);
        Matrix.addEdge(0, 3);
        Matrix.addEdge(0, 4);
        Matrix.addEdge(1, 4);
        Matrix.addEdge(2, 1);
        Matrix.addEdge(3, 6);
        Matrix.addEdge(4, 5);
        Matrix.addEdge(4, 7);
        Matrix.addEdge(5, 7);
        Matrix.addEdge(5, 2);
        Matrix.addEdge(6, 7);
        Matrix.addEdge(7, 8);
        Matrix.addEdge(8, 5);
        Matrix.printMatrix();
        
        // Menampilkan incoming edges dan outgoing edges dari node 3
        System.out.println("Incoming edges to node 0: " + Matrix.inEdges(0));
        System.out.println("Incoming edges to node 1: " + Matrix.inEdges(1));
        System.out.println("Incoming edges to node 2: " + Matrix.inEdges(2));
        System.out.println("Incoming edges to node 3: " + Matrix.inEdges(3));
        System.out.println("Incoming edges to node 4: " + Matrix.inEdges(4));
        System.out.println("Incoming edges to node 5: " + Matrix.inEdges(5));
        System.out.println("Incoming edges to node 6: " + Matrix.inEdges(6));
        System.out.println("Incoming edges to node 7: " + Matrix.inEdges(7));
        System.out.println("Incoming edges to node 8: " + Matrix.inEdges(8));
    }
}
