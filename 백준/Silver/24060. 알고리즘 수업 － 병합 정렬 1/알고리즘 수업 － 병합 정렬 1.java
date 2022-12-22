

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int c = 0;
    static int zz;
    static int zzz = -1;

    static int[] tmp;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int z1 = Integer.parseInt(arr[0]);
        int z2 = Integer.parseInt(arr[1]);
        zz = z2;
        int[] ee = new int[z1];
        tmp = new int[ee.length];

        int v = 0;
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        while (st.hasMoreTokens()){
            ee[v++] = Integer.parseInt(st.nextToken());
        }

//        arr = br.readLine().split(" ");
//        arrInt = new int[z1];
//        for(int i = 0; i < z1; i++) {
//            arrInt[i] = Integer.parseInt(arr[i]);
//        }

        merge_sort(ee , 0 , ee.length-1);
        tmp = null;

        System.out.println(zzz);

    }

    public static void merge_sort(int[] arrInt ,int p ,int r )  {

        if (p < r)  {
           int  q =  (p + r) / 2;
            merge_sort(arrInt, p, q);
            merge_sort(arrInt, q + 1, r);
            merge(arrInt, p, q, r);

        }
    }

    public static void merge(int[] arrInt,int p,int q,int r) {

        int i = p; int j = q + 1; int t = 0;
        while (i <= q && j <= r) {
            if (arrInt[i] <= arrInt[j]){
                tmp[t++] = arrInt[i++];
            } else {
            tmp[t++] = arrInt[j++];
            }
        }
        while (i <= q){
            tmp[t++] = arrInt[i++];
        }
        while (j <= r){
            tmp[t++] = arrInt[j++];
        }

        i = p; t = 0;
        while (i <= r){
            c++;
            if(c == zz){
                zzz = tmp[t];
                break;
            }
            arrInt[i++] = tmp[t++];
        }

    }
}
