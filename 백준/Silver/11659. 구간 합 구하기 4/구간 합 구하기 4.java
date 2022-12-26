
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        arr = br.readLine().split(" ");
        int arrInt[] = new int[arr.length];
        int arrInt2[] = new int[arr.length+1];
        int i = 0;
        for(String s : arr) {
            arrInt[i++] = Integer.parseInt(s);
        }


        for(int r = 1; r < arrInt2.length; r++) {
            arrInt2[r] = arrInt2[r-1] + arrInt[r-1];
        }

//        System.out.println(n);
//        System.out.println(m);
//        for(int k : arrInt) {
//            System.out.print(k);
//        }
//        System.out.println();
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < m; j++) {
            int sum = 0;

            arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            sb.append(arrInt2[b] - arrInt2[a-1]+"\n");


        }
        System.out.print(sb.toString());
    }
}
