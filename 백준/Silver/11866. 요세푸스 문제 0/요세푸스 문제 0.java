
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 0 ; i < n; i++) {
            queue.add(i+1);
        }

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < k-1; j++) {
                if(!queue.isEmpty()) {
                    int a = queue.poll();
                    queue.offer(a);
                }
            }

            sb.append(queue.poll());
            if(i != n-1) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.print(sb.toString());
    }
}
