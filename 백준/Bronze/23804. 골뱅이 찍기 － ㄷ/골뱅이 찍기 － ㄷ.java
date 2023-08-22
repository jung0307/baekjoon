import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    System.out.print("@@@@@");
                }
                System.out.println();
            }

                for(int j = 1; j <= 3*n; j++) {
                    for(int k = 1; k <= n; k++) {
                        System.out.print("@");
                    }
                    System.out.println();
                }

            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    System.out.print("@@@@@");
                }
                System.out.println();
            }



    }
}
