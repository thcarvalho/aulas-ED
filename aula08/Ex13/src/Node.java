public class Node {
    public int id;
    public int totalNeighbor;
    public Node[] neighbor;
    public boolean visited;
    public int color;
    public int distance;

    public Node() {}

    public Node(int pid) {
        id = pid;
    }
}
