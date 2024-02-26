import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        String b[] = br.readLine().split(" ");
        String c[] = br.readLine().split(" ");

        solution(a);
        solution(b);
        solution(c);

        System.out.print(sb.toString());

    }

    static void solution(String s[]) {
        int h1 = Integer.parseInt(s[0]);
        int m1 = Integer.parseInt(s[1]);
        int s1 = Integer.parseInt(s[2]);
        int h2 = Integer.parseInt(s[3]);
        int m2 = Integer.parseInt(s[4]);
        int s2 = Integer.parseInt(s[5]);

        int h3 = 0;
        int m3 = 0;
        int s3 = 0;

        if(s2 >= s1) {
            s3 = s2 - s1;
        }else {
            s3 = (s2 + 60) - s1;
            m2 = m2 - 1;
        }

        if(m2 >= m1) {
            m3 = m2 - m1;
        }else {
            m3 = (m2 + 60) - m1;
            h2 = h2 - 1;
        }

        h3 = h2 - h1;

        sb.append(h3 + " " + m3 + " " + s3 + "\n");
    }
}
