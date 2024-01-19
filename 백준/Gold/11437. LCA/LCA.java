import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static ArrayList<Integer> arr[];
    static boolean v[];
    static int parent[];
    static int depth[];
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new ArrayList[n + 1];
        v = new boolean[n + 1];
        parent = new int[n + 1];
        depth = new int[n + 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            arr[a].add(b);
            arr[b].add(a);
        }

        v[1] = true;

        findDepth(1 , 1);
        
        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++) {
            String s[] = br.readLine().split(" ");
            int nodeA = Integer.parseInt(s[0]);
            int nodeB = Integer.parseInt(s[1]);

            equalDepth(nodeA , nodeB);
        }

        System.out.print(sb.toString());

    }

    static void findDepth(int node , int dep) {
        depth[node] = dep;

        for(int child : arr[node]) {
            if(v[child] == false) {
                v[child] = true;
                parent[child] = node;
                findDepth(child , dep + 1);
            }
        }
    }

    static void equalDepth(int nodeA , int nodeB) {

        int depthA = depth[nodeA];
        int depthB = depth[nodeB];

        while (depthA > depthB) {
            depthA = depth[parent[nodeA]];
            nodeA = parent[nodeA];
        }

        while (depthB > depthA) {
            depthB = depth[parent[nodeB]];
            nodeB = parent[nodeB];
        }

        while (nodeA != nodeB) {
            nodeA = parent[nodeA];
            nodeB = parent[nodeB];
        }

        sb.append(nodeA + "\n");
    }
}
