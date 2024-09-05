import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("-1") ) {
            int n = Integer.parseInt(s);
            int arr[][] = new int[n][2];
            int sum = 0;

            for(int i = 0; i < n; i++) {
                String sss[] = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(sss[0]);
                arr[i][1] = Integer.parseInt(sss[1]);
            }

            sum = arr[0][0] * arr[0][1];

            if(arr.length > 1) {
                for(int i = 1; i < n; i++) {
                    sum = sum + arr[i][0] * (arr[i][1] - arr[i - 1][1]);
                }
            }

            sb.append(sum + " miles\n");
        }
        
        System.out.print(sb.toString());

    }
}
