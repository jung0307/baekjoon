import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            if(method(a , b , c) == true) {
                sb.append("Possible\n");
            }else {
                sb.append("Impossible\n");
            }

        }

        System.out.print(sb.toString());

    }

    static boolean method(int a , int b , int c) {

        boolean tf = false;

        if(a + b == c) {
            tf = true;
        } else if (a - b == c) {
            tf = true;
        } else if (b - a == c) {
            tf = true;
        } else if (a * b == c) {
            tf = true;
        } else if (a / (double)b == c) {
            tf = true;
        } else if (b / (double)a == c) {
            tf = true;
        }

        return tf;
    }
}
