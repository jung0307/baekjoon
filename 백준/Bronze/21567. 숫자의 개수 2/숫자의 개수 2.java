import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        long D = (long)A * B * C;
        String d[] = (D + "").split("");

        int arr[] = new int[10];

        for(int i = 0; i < d.length; i++) {
            arr[Integer.parseInt(d[i])]++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
