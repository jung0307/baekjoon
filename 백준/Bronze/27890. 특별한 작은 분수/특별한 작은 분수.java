import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int xN = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        int cnt = 0;

        while (cnt != N) {
            if(xN % 2 == 0) {
                xN = (int)Math.floor(xN/2) ^ 6;
            }else {
                xN = (2 * xN) ^ 6;
            }
            cnt++;
        }
        System.out.println(xN);
    }
}
