import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int arr[] = new int[n];

        int a = 0;
        int b = 0;

        for(int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());
            a = a + c;
            arr[i] = c;
        }

        b = (int)d / a;

        for(int i = 0; i < n; i++) {
            sb.append(arr[i] * b + "\n");
        }

        System.out.print(sb.toString());

    }
}
