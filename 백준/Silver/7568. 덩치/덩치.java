
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arrInt[][] = new int[n][3];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            arrInt[i][0] = Integer.parseInt(s[0]);
            arrInt[i][1] = Integer.parseInt(s[1]);
        }

//        Arrays.sort(arrInt, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]) {
//                    return o2[1] - o1[1];
//                }else {
//                    return o2[0] - o1[0];
//                }
//            }
//        });

//        for(int a[] : arrInt) {
//            for(int b : a) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }

        int a = 0;
        int b = 0;
        while (a <= arrInt.length-1) {

            int maxW = arrInt[a][0];
            int maxH = arrInt[a][1];
            int count = 1;

            for(int i =0; i < arrInt.length; i++ ) {
                if(maxH < arrInt[i][1] && maxW < arrInt[i][0]) {
                    count++;
                }
            }

            if(a == arrInt.length-1) {
                sb.append(count);
            }else {
                sb.append(count + " ");

            }
            a++;
        }

        System.out.print(sb.toString());

    }
}
