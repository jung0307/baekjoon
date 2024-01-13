import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int depth[];
    static int parent[];
    static ArrayList<Integer> arr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr = new ArrayList[m + 1];
            depth = new int[m + 1];
            parent = new int[m + 1];

            for(int j = 1; j < arr.length; j++) {
                arr[j] = new ArrayList<>();
            }

            boolean v[] = new boolean[m + 1];
            int root = 0;

            for(int j = 1; j < m; j++) {
                String s[] = br.readLine().split(" ");
                int p = Integer.parseInt(s[0]); // 부모
                int c = Integer.parseInt(s[1]); // 자식

                arr[p].add(c);
                v[c] = true;
            }

            for(int j = 1; j < v.length; j++) {
                if(v[j] == false) {
                    root = j;
                }
            }



            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            dfs(root , 1);

            sb.append(equalLevel(a , b) + "\n");

        }

        System.out.print(sb.toString());


    }

    static void dfs(int node , int d) {
        depth[node] = d;

        for(int child : arr[node]) {
            if(depth[child] == 0) {
                dfs(child , d + 1);
                parent[child] = node;
            }
        }

    }

    static int equalLevel(int a , int b) {
        while (depth[a] < depth[b]) {
            b = parent[b];
        }
        while (depth[a] > depth[b]) {
            a = parent[a];
        }

        while (a != b) {
            a = parent[a];
            b = parent[b];
        }

        return a;
    }
}
