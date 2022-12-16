

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static int[] arrInt2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        5
//        5
//        4
//        3
//        2
//        1

        int n = Integer.parseInt(br.readLine());
        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++) {
           int m = Integer.parseInt(br.readLine());
            arrInt[i] = m;
        }

        arrInt2 = new int[arrInt.length];
        solution(arrInt , 0 , n-1);
        arrInt2 = null;

        for(int a : arrInt){
            bw.write(a+"\n");
        }

        bw.flush();

    }

    public static void solution(int[] arrInt , int l , int r) {

        if(r > l){
            int center = (l + r)/2;
            int i;
            int p = 0;
            int j = 0;
            int k = l;

            solution(arrInt , l , center);
            solution(arrInt , center+1 , r);

            for(i = l; i <= center; i++) {
                arrInt2[p++] = arrInt[i];
            }
            while (i <= r && j < p) {
                arrInt[k++] = arrInt[i] >= arrInt2[j] ? arrInt2[j++] : arrInt[i++];
            }
            while (j < p) {
                arrInt[k++] = arrInt2[j++];
            }
        }

    }

}
