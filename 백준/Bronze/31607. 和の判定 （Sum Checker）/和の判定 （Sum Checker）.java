import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a + b == c) {
            System.out.println("1");
        } else if (a + c == b) {
            System.out.println("1");
        } else if (b + c == a) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }
}
