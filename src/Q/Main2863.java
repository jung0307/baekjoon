package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main2863 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);

        Deque<Integer> deque = new LinkedList<>();
        deque.add(a);
        deque.add(b);
        deque.add(d);
        deque.add(c);

        double arrDou[] = new double[4];

        for(int i = 0; i < 4; i++) {
            int A = deque.pollFirst();
            int B = deque.pollFirst();
            int D = deque.pollFirst();
            int C = deque.pollFirst();

            arrDou[i] = (double) A/D + B/C;

            deque.add(A);
            deque.add(B);
            deque.add(D);
            deque.add(C);

            int E = deque.pollLast();
            deque.addFirst(E);
        }

        double max = arrDou[0];
        int maxI = 0;

        for(int i = 0; i < 4; i++) {
             if(max < arrDou[i]) {
                 max = arrDou[i];
                 maxI = i;
             }
        }

        System.out.println(maxI);

    }
}
