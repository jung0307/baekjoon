
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = 2*i; j <2*n-1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

        for(int i = 1; i < n; i++) {

            for(int j = 0; j < n - (i+1); j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

                System.out.println();
        }

    }
}
