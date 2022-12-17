

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int temp[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String arr[] = s.split("");
        int[] arrInt = new int[arr.length];

        int p = 0;
        for(String a : arr) {
            arrInt[p] = Integer.parseInt(a);
            p++;
        }

//        for(int a : arrInt) {
//            System.out.println(a);
//        }

        temp = new int[arrInt.length];
        sortHtL(arrInt,0,arrInt.length-1);
        temp = null;

         for(int a : arrInt) {
            System.out.print(a);
        }

    }

    public static void sortHtL(int arrInt[] , int l , int r) {

        if(l < r){

            int center = (l + r)/2;
            int i;
            int p = 0;
            int j = 0;
            int k = l;

            sortHtL(arrInt , l , center);
            sortHtL(arrInt , center+1 , r);

            for(i = l; i <= center; i++) {
                temp[p++] = arrInt[i];
            }
            while (i <= r && j < p) {
                arrInt[k++] = (arrInt[i] >= temp[j] ? arrInt[i++] : temp[j++]);
            }
            while (j < p) {
                arrInt[k++] = temp[j++];
            }

        }



    }


}
