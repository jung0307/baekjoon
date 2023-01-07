

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        System.out.println(solution( solution(n) + solution(m) ));

    }

    public static int solution(int n) {
        String s1[] = Integer.toString(n).split("");

        for(int i = 0; i < s1.length/2; i++) {
            String temp = s1[i];
            s1[i] = s1[s1.length -1 - i];
            s1[s1.length - 1 - i] = temp;
        }

        String a = "";
        for(String b : s1) {
            a = a + b;
        }

        int z = Integer.parseInt(a);
        return z;
    }
}
