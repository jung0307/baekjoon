
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n % 2 == 0) {
            System.out.println("I LOVE CBNU");
        }else {
            int cnt = 1;
            int sum = 1;
            while (true) {
                if(sum != n) {
                    sum = sum + 2;
                    cnt++;
                }else {
                    break;
                }
            }

            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for(int i = 0; i < n/2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for(int i = 0; i < cnt-1; i++) {
                for(int j = 0; j < n/2 - (i+1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < 2*i + 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }
        }

    }
}
