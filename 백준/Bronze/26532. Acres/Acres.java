import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        double c = (double) a * b / 4840;

        int d = (int)Math.ceil(c);

        if(d % 5 == 0) {
            System.out.println(d / 5);
        }else {
            System.out.println((d / 5) + 1);
        }

    }
}
