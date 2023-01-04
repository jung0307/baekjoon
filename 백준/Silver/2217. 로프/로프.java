

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arrInt);

//        for(int c : arrInt) {
//            System.out.print(c);
//        }
//        System.out.println();

        int a = 0;
        int b = 0;

        int max = arrInt[0];

//        if(n%2 != 0) {
//             a = n/2;
//             b = n/2+1;
//        }else {
//            a = n/2-1;
//            b = n/2+1;
//        }


        for(int i = 0; i < n; i++) {

            for(int j = n-i-1; j < n-i; j++) {
                if(max < arrInt[j]*(i+1)) {
                    max = arrInt[j]*(i+1);
                }
            }

        }


        System.out.println(max);

    }
}
