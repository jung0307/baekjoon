import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        String cam = "CAMBRIDGE";

        int arrInt[] = new int[26];

        for(int i = 0; i < cam.length(); i++) {
            arrInt[(int)cam.charAt(i) - 65]++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(arrInt[(int)s.charAt(i) - 65] == 0) {
                sb.append(s.charAt(i));
            }
        }

        System.out.print(sb.toString());

    }
}
