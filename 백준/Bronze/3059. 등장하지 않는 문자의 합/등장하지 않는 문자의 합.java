
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < n; j++) {
            String s[] = br.readLine().split("");
            char arrChar[] = new char[26];
            int sum = 0;

            for(int i = 0; i < 26; i++) {
                arrChar[(int)('A')-65] = 0;
            }

            for(int i = 0; i < s.length; i++) {
                arrChar[(int)s[i].charAt(0) - 65] = 1;
            }

            for(int i = 0; i < 26; i++) {
                if(arrChar[i] == 0) {
                    sum = sum + i+65;
                }
            }
            sb.append(sum+"\n");
        }

        System.out.print(sb.toString());

    }
}
