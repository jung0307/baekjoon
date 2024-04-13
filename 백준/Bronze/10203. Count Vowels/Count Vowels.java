import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String ss = br.readLine();
            String s[] = ss.split("");
            int sum = 0;

            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("a") || s[j].equals("e") || s[j].equals("i") || s[j].equals("o") || s[j].equals("u")) {
                    sum++;
                }
            }

            sb.append("The number of vowels in " + ss + " is " + sum + ".\n");
        }

        System.out.print(sb.toString());

    }
}
