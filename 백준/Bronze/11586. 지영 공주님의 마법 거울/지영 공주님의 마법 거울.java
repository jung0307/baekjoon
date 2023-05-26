
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][n];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");

            for(int j = 0; j < n; j++) {
                arr[i][j] = s[j];
            }
        }

        int m = Integer.parseInt(br.readLine());

        if(m == 1) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }else if(m == 2) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n/2; j++) {
                    String sss = arr[i][j];
                    arr[i][j] = arr[i][n - 1 - j];
                    arr[i][n - 1 - j] = sss;
                }
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }else {
            for(int i = n - 1; i >= 0; i--) {
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        
    }
}
