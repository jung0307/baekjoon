import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int cnt = 1;
        int a = 0;

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            a = queue.poll();

            if(cnt % K == 0) {
                arr.add(a);
            }else {
                queue.add(a);
            }

            cnt++;
        }

        sb.append("<");

        for(int i = 0; i < arr.size() - 1; i++) {
            sb.append(arr.get(i) + ", ");
        }

        sb.append(arr.get(arr.size() - 1) + ">");

        System.out.println(sb.toString());

    }
}
