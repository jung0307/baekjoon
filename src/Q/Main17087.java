package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main17087 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int n = Integer.parseInt(s1[0]);
        int s = Integer.parseInt(s1[1]);

        ArrayList<Integer> arrInt = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(s);

        for(int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(s2[i]));
        }

        for(int i = 0; i < n + 1; i++) {
            int z = pq.poll();
            arrInt.add(z);
        }

//        System.out.println("================");
//        for(int i = 0; i < arrInt.size(); i++) {
//            System.out.println(arrInt.get(i));
//        }
//        System.out.println("================");


        for(int i = 0; i < arrInt.size() - 1; i++) {
            int d = arrInt.get(i+1) - arrInt.get(i);
            arrInt2.add(d);
        }

        Collections.sort(arrInt2);

//        System.out.println("================");
//        for(int i = 0; i < arrInt2.size(); i++) {
//            System.out.println(arrInt2.get(i));
//        }
//        System.out.println("================");

        int z = 0;
        int y = arrInt2.get(0);
        boolean tf = false;

        while (true) {

            if(arrInt2.get(z) % y == 0) {
                z++;
            }else {
                y--;
                z = 0;
            }

            if(z == arrInt2.size()) {
                break;
            }

        }

        System.out.println(y);




    }
}
