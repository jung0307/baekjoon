import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int N;
    static int arr[][];
    static int distance[][];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        arr = new int[N + 1][N + 1];
        distance = new int[N + 1][N + 1];

        for(int i = 0; i < N - 1; i++) {
            String ss[] = br.readLine().split(" ");

            int node1 = Integer.parseInt(ss[0]);
            int node2 = Integer.parseInt(ss[1]);
            int d = Integer.parseInt(ss[2]);

            arr[node1][node2] = 1;
            arr[node2][node1] = 1;

            distance[node1][node2] = d;
            distance[node2][node1] = d;
        }

        for(int i = 0; i < M; i++) {
            String ss[] = br.readLine().split(" ");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);

            a(a , b);

        }


    }

    static void a(int node1 , int node2) {
        boolean v[] = new boolean[N + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(node1);
        v[node1] = true;
        int sum[] = new int[N + 1];

        while (!queue.isEmpty()) {

            int cur = queue.poll();
            for(int i = 1; i <= N; i++) {

                if(arr[cur][i] == 1 && v[i] == false) {
                    v[i] = true;
                    sum[i] = sum[cur] + distance[cur][i];

                    if(i == node2) {
                        System.out.println(sum[i]);
                        break;
                    }

                    queue.add(i);

                }
            }
        }

    }
}
