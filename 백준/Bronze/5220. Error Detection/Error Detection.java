import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n ; i++) {
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(solution(a , b)) {
                sb.append("Valid\n");
            }else {
                sb.append("Corrupt\n");
            }
        }

        System.out.print(sb.toString());



    }

    static boolean solution(int a , int b) {

        boolean tf = false;
        int cnt = 0;
        int c = 0;

        while (a > 0) {
            c = a % 2;

            if(c == 1) {
                cnt++;
            }

            a = a / 2;
        }

        if(cnt % 2 == 0 && b == 0) {
            tf = true;
        } else if (cnt % 2 == 1 && b == 1) {
            tf = true;
        }

        return tf;

    }
}
