import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long sum = 0;
        String ss[] = s.split("");
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < ss.length; i++) {
            queue.add(Integer.parseInt(ss[i]));
        }

        for(int i = 0; i < ss.length; i++) {
            String sss = "";
            int a = queue.pollLast();

            queue.addFirst(a);

            while (!queue.isEmpty()) {
                sss = sss + queue.pollFirst();
            }

            sum = sum + Long.parseLong(sss);

            String ssss[] = sss.split("");

            for(int j = 0; j < ssss.length; j++) {
                queue.add(Integer.parseInt(ssss[j]));
            }

        }

        System.out.println(sum);

    }
}
