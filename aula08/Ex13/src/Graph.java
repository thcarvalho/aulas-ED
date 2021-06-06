import java.util.LinkedList;
import java.util.concurrent.TimeoutException;

public class Graph {
    static final int INFINITY = Integer.MAX_VALUE / 4;
    static int totalNodes;
    static boolean[][] adjacence;
    static int[][] distanceMatrix;
    static boolean[] visits;
    static boolean[] colors;
    static Node nodes[];
    static int totalColors = 5;
    static Node[] solution;
    static int[] tempSolution;
    static int[] bestSolution;
    static int bestSolutionValue;
    static int currentSolutionValue;

    public Graph(int n, int m) {
        totalNodes = n;
        adjacence = new boolean[n][n];
        visits = new boolean[n];
        nodes = new Node[n];
        distanceMatrix = new int[n][n];
    }

    private static int deepFirstSearch(Node current, Node end, int visits) {
        current.visited = true;
        if (current == end)
            return visits;
        for (Node temp : current.neighbor) {
            if (!temp.visited) {
                int value = deepFirstSearch(temp, end, visits + 1);
                if (value > 0) return value;
            }
        }
        return -1;
    }

    private static int breadthFirstSearch(Node begin, Node end) {
        if (begin == end) return 0;
        LinkedList<Node> linkedList = new LinkedList<>();
        begin.distance = 0;
        begin.visited = true;
        linkedList.add(begin);
        Node current;
        while (!linkedList.isEmpty()) {
            current = linkedList.remove();
            for (Node temp : current.neighbor) {
                if (!temp.visited) {
                    if (temp == end) return current.distance + 1;
                    temp.visited = true;
                    temp.distance = current.distance + 1;
                    linkedList.add(temp);
                }
            }
        }
        return -1;
    }
}
