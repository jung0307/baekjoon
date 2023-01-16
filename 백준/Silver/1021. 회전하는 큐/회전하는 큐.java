
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;

        for(int i = 0; i < a; i++) {
            deque.add(i+1);
        }
        int b = 0;
        while (b <= s2.length -1) {
            int c = Integer.parseInt(s2[b]);
            int d = 0;
            int e = deque.size()-1;
            int z = 0;
            int y = 0;
            while (deque.get(d) != c) {

                //System.out.println(d);

                    z++;
                    d++;

            }

            while (deque.get(e) != c) {

                //System.out.println(e);

                    y++;
                    e--;

            }

            if(y == 0) {
                y++;
            }

//            System.out.println(b+"b");
//            System.out.println(c+"c");
//            System.out.println(d+"d");
//            System.out.println(e+"e");
//            System.out.println(z+"z");
//            System.out.println(y+"y");


            if(z <= y) {
                for(int j = 0; j < z; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }else {
                for(int j = 0; j < y; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }

//            for(int j = 0; j < deque.size(); j++) {
//                System.out.print(deque.get(j)+" ");
//            }
//            System.out.println();

            if(deque.peekFirst() == Integer.parseInt(s2[b])) {
                b++;
                deque.pollFirst();
            }

        }

        System.out.println(count);
    }
}
