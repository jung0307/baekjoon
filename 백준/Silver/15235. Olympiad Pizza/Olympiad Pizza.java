import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        int arr[][] = new int[n][2];
        int time = 0;
        int cnt;

        for(int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(s[i]);
        }

        while (true) {

            cnt = 0;

            for(int i = 0; i < n; i++) {
                if(arr[i][0] != 0) {
                    time++;
                    arr[i][0]--;
                    arr[i][1] = time;
                }
            }

            for(int i = 0; i < n; i++) {
                cnt = cnt + arr[i][0];
            }

            if(cnt == 0) {
                break;
            }

        }

        for(int i = 0; i < n - 1; i++) {
            System.out.print(arr[i][1] + " ");
        }
        System.out.print(arr[n - 1][1]);



    }
}
