import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr[];
    static boolean v[];
    static int depth[];
    static int parent[];
    static int sum = 0;

    static int[] toVisitCity;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new ArrayList[n + 1];
        v = new boolean[n + 1];
        depth = new int[n + 1];
        parent = new int[n + 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int nodeA = Integer.parseInt(s[0]);
            int nodeB = Integer.parseInt(s[1]);

            arr[nodeA].add(nodeB);
            arr[nodeB].add(nodeA);
        }

        v[1] = true;
        findDepth(1 , 0);

        int m = Integer.parseInt(br.readLine());
        toVisitCity = new int[m];

        for(int i = 0; i < m; i++) {
            int toVisit = Integer.parseInt(br.readLine());
            toVisitCity[i] = toVisit;
        }

        for(int i = 0; i < toVisitCity.length - 1; i++) {
            lengthSum(toVisitCity[i], toVisitCity[i + 1]);
        }

        System.out.println(sum);

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

    static int equalLevel(int nodeA , int nodeB) {
        int depthA = depth[nodeA];
        int depthB = depth[nodeB];

        while (depthA < depthB) {
            depthB = depth[parent[nodeB]];
            nodeB = parent[nodeB];
        }

        while (depthB < depthA) {
            depthA = depth[parent[nodeA]];
            nodeA = parent[nodeA];
        }

        while (nodeA != nodeB) {
            nodeA = parent[nodeA];
            nodeB = parent[nodeB];
        }

        return nodeA;
    }

    static void lengthSum(int nodeA , int nodeB) {

        int equalParent = equalLevel(nodeA , nodeB);

        if(equalParent == nodeA) {
            sum = sum + (depth[nodeB] - depth[equalParent]);
        } else if (equalParent == nodeB) {
            sum = sum + (depth[nodeA] - depth[equalParent]);
        } else if (equalParent != nodeA && equalParent != nodeB) {
            sum = sum + (depth[nodeA] - depth[equalParent]) + (depth[nodeB] - depth[equalParent]);
        }
    }
}
