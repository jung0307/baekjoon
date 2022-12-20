

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arrInt = new int[3][2];

        int[] arrInt1 = new int[1001];
        int[] arrInt2 = new int[1001];

        int a1 = 0;
        int a2 = 0;

        StringTokenizer st;

        for(int i = 0; i < 3; i++) {

            st = new StringTokenizer(br.readLine() , " ");
            arrInt[i][0] = Integer.parseInt(st.nextToken());
            arrInt[i][1] = Integer.parseInt(st.nextToken());

            arrInt1[arrInt[i][0]] = arrInt1[arrInt[i][0]] + 1;
            arrInt2[arrInt[i][1]] = arrInt2[arrInt[i][1]] + 1;
        }

//        for(int[] a : arrInt){
//            for(int b : a){
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }


        for(int j = 1; j < arrInt1.length; j++){
            if(arrInt1[j] == 1) {
                a1 = j;
                break;
            }

        }
        for(int j = 1; j < arrInt2.length; j++){
            if(arrInt2[j] == 1) {
                a2 = j;
                break;
            }

        }
//
//        System.out.println(arrInt2[10]);
//        System.out.println(arrInt2[20]);

        System.out.println(a1 + " " + a2);

    }

}
