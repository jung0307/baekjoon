
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while (pq.size() > 1) {
            long a = pq.poll() + pq.poll();
            pq.add(a);
            sum = sum + a;
        }

        System.out.println(sum);



    }
}
