

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt[][] = new int[n][2];

        StringTokenizer st;

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            arrInt[i][0] = Integer.parseInt(st.nextToken());
            arrInt[i][1] = Integer.parseInt(st.nextToken());

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
