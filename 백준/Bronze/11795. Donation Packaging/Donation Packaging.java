import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[3];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            arr[0] = arr[0] + Integer.parseInt(s[0]);
            arr[1] = arr[1] + Integer.parseInt(s[1]);
            arr[2] = arr[2] + Integer.parseInt(s[2]);

            if(arr[0] >= 30 && arr[1] >= 30 && arr[2] >= 30) {
                int min = Math.min(Math.min(arr[0],arr[1]) , arr[2]);
                sb.append(min + " \n");

                arr[0] = arr[0] - min;
                arr[1] = arr[1] - min;
                arr[2] = arr[2] - min;

            }else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());

    }
}
