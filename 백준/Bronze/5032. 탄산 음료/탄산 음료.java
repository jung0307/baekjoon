
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int empty = a+b;
        int soda = 0;
        int sum = 0;

        while (true) {
            soda = empty / c;
            empty = empty - (soda * c) + soda;
            sum = sum + soda;

            if(empty < c) {
                break;
            }
        }

        System.out.println(sum);

    }
}
