import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<node> arr[];
    static boolean v[];
    static int max = 0;
    static int maxNode = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new ArrayList[n + 1];
        v = new boolean[n + 1];

        for(int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            arr[a].add(new node(b , c));
            arr[b].add(new node(a , c));

        }

        v[1] = true;
        dfs(1 , 0);

        v = new boolean[n + 1];
        v[maxNode] = true;
        dfs(maxNode , 0);

        System.out.println(max);

    }

    static void dfs(int index , int wei) {
        if(max < wei) {
            max = wei;
            maxNode = index;
        }

        for(node next : arr[index]) {
            if(v[next.index] == false) {
                v[next.index] = true;
                dfs(next.index , next.weight + wei);
            }
        }
    }


}

class node {
    int index;
    int weight;

    node(int index , int weight) {
        this.index = index;
        this.weight = weight;
    }


}
