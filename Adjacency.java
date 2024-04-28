import java.util.ArrayList;
import java.util.List;

public class Adjacency {
    int n;
    char[][] a;

    Adjacency(int n0) {
        n = n0;
        a = new char[n][n];
    }

    //keberadaan edge
    public void addEdge(int i, int j) {
        a[i][j] = 'X'; 
    }

    // Menghapus edge
    public void removeEdge(int i, int j) {
        a[i][j] = '\0'; 
    }

    public boolean hasEdge(int i, int j) {
        return a[i][j] != '\0';
    }

    // Konversi indeks menjadi huruf
    List<Character> outEdges(int i) {
        List<Character> edges = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (a[i][j] != '\0')
                edges.add((char) ('A' + j)); 
        return edges;
    }

    // Konversi indeks menjadi huruf
    List<Character> inEdges(int i) {
        List<Character> edges = new ArrayList<>();
        for (int j = 0; j < n; j++)
            if (a[j][i] != '\0')
                edges.add((char) ('A' + j)); 
        return edges;
    }

    public void printMatrix() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != '\0')
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("- ");
                }
                System.out.println();
            }
        }
}
