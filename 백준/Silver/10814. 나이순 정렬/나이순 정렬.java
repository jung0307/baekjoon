

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
        String[][] arr = new String[n][2];

        StringTokenizer st;

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine() , " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();

        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
//                if(Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])){
//                    return
//                }
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);

            }
        });

//        for(int[] a : arrInt) {
//            System.out.print(a[0]);
//            System.out.print(a[1]);
//            System.out.println();
//        }

        StringBuilder sb = new StringBuilder();
        for(String[] b : arr) {
            sb.append(b[0] + " " + b[1]+"\n");
        }

        System.out.print(sb.toString());

    }

}
