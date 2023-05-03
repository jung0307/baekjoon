
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
