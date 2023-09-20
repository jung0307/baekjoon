import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if(n - m >= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }else {

            if(m - n >= 1 && m - n <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            } else if (m - n >= 21 && m - n <= 30) {
                System.out.println("You are speeding and your fine is $270.");
            }else {
                System.out.println("You are speeding and your fine is $500.");
            }

        }

    }
}
