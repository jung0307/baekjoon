import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");
        int sum = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u")) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
