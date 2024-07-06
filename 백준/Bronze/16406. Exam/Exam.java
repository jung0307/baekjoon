import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;

        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");

        for(int i = 0; i < s1.length; i++) {
            if(s1[i].equals(s2[i])) {
                m++;
            }
        }

        if(m == 0) {
            System.out.println(s1.length - n);
        }else {
            if(m >= n) {
                System.out.println(s1.length + n - m);
            }else {
                System.out.println(s1.length + m - n);
            }
        }
    }
}