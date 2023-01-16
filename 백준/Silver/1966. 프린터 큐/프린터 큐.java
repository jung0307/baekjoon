import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s1[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");

            int a = Integer.parseInt(s1[1]);
            LinkedList<int[]> queue = new LinkedList<>();

            for(int j = 0; j < s2.length; j++) {
                queue.add(new int[] {j , Integer.parseInt(s2[j])});
            }

            int count = 0;

            while (!queue.isEmpty()) {

                int max = queue.get(0)[1];

                for(int j = 0; j < queue.size(); j++) {
                    if(max < queue.get(j)[1]) {
                        max = queue.get(j)[1];
                    }
                }

                if(queue.peek()[1] < max) {
                    queue.add(queue.poll());
                }else if(queue.peek()[0] == a && queue.peek()[1] == max) {
                    count++;
                    break;
                }else if(queue.peek()[0] != a && queue.peek()[1] == max) {
                    count++;
                    queue.poll();
                }

            }

            sb.append(count+"\n");
        }
        System.out.print(sb.toString());
    }
}
