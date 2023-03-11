
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(a > b) {
                sumB = sumB + a;
            }else if(a < b) {
                sumA = sumA + b;
            }
        }

        System.out.println(100 - sumA);
        System.out.println(100 - sumB);

    }
}
