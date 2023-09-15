import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                a = a + 3 * Integer.parseInt(br.readLine());
            } else if (i == 1) {
                a = a + 2 * Integer.parseInt(br.readLine());
            } else {
                a = a + 1 * Integer.parseInt(br.readLine());
            }
        }

        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                b = b + 3 * Integer.parseInt(br.readLine());
            } else if (j == 1) {
                b = b + 2 * Integer.parseInt(br.readLine());
            } else {
                b = b + 1 * Integer.parseInt(br.readLine());
            }

        }

        if(a > b) {
            System.out.println("A");
        } else if (a == b) {
            System.out.println("T");
        }else {
            System.out.println("B");
        }
    }
}
