import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String s = "";

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            String arr[] = br.readLine().split(" ");

            s = arr[0];

            for(int j = 1; j < m; j++) {
                if((int)s.charAt(0) >= (int)arr[j].charAt(0)) {
                    s = arr[j] + s;
                }else {
                    s = s + arr[j];
                }
            }

            sb.append(s + "\n");
        }

        System.out.print(sb.toString());

    }
}
