package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main2979 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> arrInt = new ArrayList<>();


            String s1[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");
            String s3[] = br.readLine().split(" ");

            pq.add(Integer.parseInt(s1[0]));
            pq.add(Integer.parseInt(s1[1]));
            pq.add(Integer.parseInt(s2[0]));
            pq.add(Integer.parseInt(s2[1]));
            pq.add(Integer.parseInt(s3[0]));
            pq.add(Integer.parseInt(s3[1]));

            int pqSize = pq.size();

        for(int i = 0; i < pqSize; i++) {
            arrInt.add(pq.poll());
        }

        int[] arrBl1 = new int[arrInt.size()-1];
        int[] arrBl2 = new int[arrInt.size()-1];
        int[] arrBl3 = new int[arrInt.size()-1];

        for(int i = 0; i < arrInt.size()-1; i++) {
            if(arrInt.get(i) >= Integer.parseInt(s1[0]) && arrInt.get(i+1) <= Integer.parseInt(s1[1]) ) {
                    arrBl1[i] = 1;
            }else {
                    arrBl1[i] = 0;
            }
            if(arrInt.get(i) >= Integer.parseInt(s2[0]) && arrInt.get(i+1) <= Integer.parseInt(s2[1]) ) {
                    arrBl2[i] = 1;
            }else {
                    arrBl2[i] = 0;
            }
            if(arrInt.get(i) >= Integer.parseInt(s3[0]) && arrInt.get(i+1) <= Integer.parseInt(s3[1]) ) {
                    arrBl3[i] = 1;
            }else {
                    arrBl3[i] = 0;
            }
        }

        int sum = 0;

        for(int i = 0; i < arrInt.size() - 1; i++) {
            int aa = arrInt.get(i+1) - arrInt.get(i);
            int aaa = 0;
            int aaaa = 1;

            if(arrBl1[i] + arrBl2[i] + arrBl3[i] == 1) {
                aaa = Integer.parseInt(s[0]);
            }else if(arrBl1[i] + arrBl2[i] + arrBl3[i] == 2) {
                aaa = Integer.parseInt(s[1]);
                aaaa = 2;
            }else if(arrBl1[i] + arrBl2[i] + arrBl3[i] == 3) {
                aaa = Integer.parseInt(s[2]);
                aaaa = 3;
            }

            sum = sum + aa * aaa * aaaa;

        }
        System.out.println(sum);

    }
}
