

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] arrLong = new long[100+1];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        arrLong[1] = 1;
        arrLong[2] = 1;
        arrLong[3] = 1;
        arrLong[4] = 2;
        arrLong[5] = 2;

        int z = 6;

        while (z <= 100) {
            arrLong[z] = arrLong[z-1] + arrLong[z-5];
            z++;
        }

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            sb.append(arrLong[m]+"\n");

        }

        System.out.print(sb.toString());

    }

//    static int solution(int a) {
//
//        if(a <= 3) {
//            return 1;
//        }else if(a <= 5) {
//            return 2;
//        }else {
//            int b = solution(a-1) + solution(a-5);
//            return b;
//        }
//    }

}
