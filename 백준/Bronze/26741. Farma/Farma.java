import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int head = Integer.parseInt(s[0]);
        int leg = Integer.parseInt(s[1]);

        int a = 0;

        for(int i = 1; i <= head; i++) {
            if(2*i + (head - i)*4 == leg) {
                a = i;
                break;
            }
        }

        System.out.println(a + " " + (head - a));

    }
}