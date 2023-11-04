import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.readLine().charAt(0);
        String s2 = "ILOVEYONSEI";

//        System.out.println((int)'A'); // 65
//        System.out.println((int)'Z'); // 90

        int sum = Math.abs(a - (int)'I');

        for(int i = 1; i < 10; i++) {
            sum = sum + Math.abs((int)s2.charAt(i + 1) - (int)s2.charAt(i));
        }

        System.out.println(sum + 3);

    }
}
