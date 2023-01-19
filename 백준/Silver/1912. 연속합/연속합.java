
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");

        int[] arrInt = new int[n];
        int[] arrInt2 = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        arrInt2[0] = arrInt[0];
        int max = arrInt2[0];

        for(int i = 1; i < arrInt2.length; i++) {
            arrInt2[i] = Math.max(arrInt2[i-1] + arrInt[i] , arrInt[i]);
            max = Math.max(max , arrInt2[i]);
        }

        System.out.println(max);



    }
}
