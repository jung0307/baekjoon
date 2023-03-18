package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main2740 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);

        ArrayList<Integer[]> arr = new ArrayList<>();
        ArrayList<Integer[]> arr2 = new ArrayList<>();

        for(int i = 0; i < a; i++) {

            String[] s2 = br.readLine().split(" ");
            Integer[] aa = new Integer[b];

            for(int j = 0; j < b; j++) {
                aa[j] = Integer.parseInt(s2[j]);
            }
            arr.add(aa);

        }

        String s3[] = br.readLine().split(" ");

        int c = Integer.parseInt(s3[0]);
        int d = Integer.parseInt(s3[1]);

        for(int i = 0; i < c; i++) {

            String[] s4 = br.readLine().split(" ");
            Integer[] bb = new Integer[d];

            for(int j = 0; j < d; j++) {
                bb[j] = Integer.parseInt(s4[j]);
            }
            arr2.add(bb);

        }


//        for(int i = 0; i < arr.size(); i++) {
//            for(int j = 0; j < b; j++) {
//                System.out.print(arr.get(i)[j]+" ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < arr2.size(); i++) {
//            for(int j = 0; j < d; j++) {
//                System.out.print(arr2.get(i)[j]+" ");
//            }
//            System.out.println();
//        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a; i++) {

            for(int j = 0; j < d; j++) {
                int sum = 0;
                int z = 0;

                for(int k = 0; k < b; k++) {

                    sum = sum + arr.get(i)[k] * arr2.get(k)[j];

                    if(z == b-1) {
                        int x = sum;
                        sum = 0;
                        z = 0;
                        sb.append(x + " ");
                    }
                        z++;
                }

            }

            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}
