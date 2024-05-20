import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(n % 2 == 1) {

            for(int i = 0; i < n; i++) {
                br.readLine();
            }

            sb.append("still running");
        }else {

            int arr[] = new int[n];
            int time = 0;

            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            for(int i = 1; i < n; i = i = i + 2) {
                time = time + (arr[i] - arr[i - 1]);
            }

            sb.append(time);
        }

        System.out.print(sb.toString());


    }
}
