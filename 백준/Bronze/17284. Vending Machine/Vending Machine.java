import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String[] s = br.readLine().split(" ");

        for(int i = 0; i < s.length; i++) {

            if(s[i].equals("1")) {
                sum = sum + 500;
            } else if (s[i].equals("2")) {
                sum = sum + 800;
            } else if (s[i].equals("3")) {
                sum = sum + 1000;
            }
        }

        System.out.println(5000 - sum);
    }
}