

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt[][] = new int[n][2];

        for(int i = 0; i < n; i++) {

            String s = br.readLine();
            String arr[] = s.split(" ");

            arrInt[i][0] = Integer.parseInt(arr[0]);
            arrInt[i][1] = Integer.parseInt(arr[1]);

        }

        Arrays.sort(arrInt, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int[] a : arrInt ) {
            System.out.println(a[0] + " " +a[1]);
        }


    }

}
