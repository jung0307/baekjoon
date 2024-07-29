import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int arr[] = new int[N + M - 1];

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= M; j++) {
                arr[i + j - 2]++;
            }
        }

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(max <= arr[i]) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                sb.append(i + 2 + "\n");
            }
        }

        System.out.print(sb.toString());


    }
}
