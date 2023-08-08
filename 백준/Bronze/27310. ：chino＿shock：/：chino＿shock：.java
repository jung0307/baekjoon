import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int a = s.length;
        int b = 0;
        int c = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals(":")) {
                b++;
            } else if (s[i].equals("_")) {
                c++;
            }

        }

        System.out.println(a + b + c * 5);
    }
}
