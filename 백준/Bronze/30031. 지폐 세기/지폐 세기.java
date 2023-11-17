import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            if(s[0].equals("136")) {
                sum = sum + 1000;
            } else if (s[0].equals("142")) {
                sum = sum + 5000;
            } else if (s[0].equals("148")) {
                sum = sum + 10000;
            }else {
                sum = sum + 50000;
            }
        }

        System.out.println(sum);

    }
}
