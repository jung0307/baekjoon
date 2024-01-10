import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        int parent[];
        boolean v[];
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        parent = new int[n + 1];
        v = new boolean[n + 1];
        ArrayList<Integer> arr[] = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i < n - 1; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            arr[a].add(b);
            arr[b].add(a);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        v[1] = true;

        while (!(queue.isEmpty())) {
            int cur = queue.poll();

            for(int next : arr[cur]) {
                if(v[next] == true) {
                    continue;
                }
                v[next] = true;
                queue.add(next);
                parent[next] = cur;
            }
        }

        for(int i = 2; i < parent.length; i++) {
            sb.append(parent[i] + "\n");
        }

        System.out.print(sb.toString());

    }

}
