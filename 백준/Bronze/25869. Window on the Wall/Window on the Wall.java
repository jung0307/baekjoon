import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int w = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);

        if(w - 2*d <= 0) {
            System.out.println("0");
        } else if (h - 2*d <= 0) {
            System.out.println("0");
        }else {
            System.out.println((w - 2*d) * (h - 2*d));
        }

    }
}