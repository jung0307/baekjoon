
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> que = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            que.add(i);
        }

        while (que.size() != 1) {
            int f = que.pollFirst();
            int f2 = que.pollFirst();

            que.offerLast(f2);

            sb.append(f+" ");
        }

        sb.append(que.poll());

        System.out.print(sb.toString());
    }
}
