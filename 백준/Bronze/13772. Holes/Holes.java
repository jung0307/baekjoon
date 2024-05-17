import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int cnt = 0;

            for(int j = 0; j < s.length; j++) {
                String ss[] = s[j].split("");

                for(int k = 0; k < s[j].length(); k++) {
                    if(ss[k].equals("A") || ss[k].equals("D") || ss[k].equals("O") || ss[k].equals("P") || ss[k].equals("Q") || ss[k].equals("R")) {
                        cnt++;
                    } else if (ss[k].equals("B")) {
                        cnt = cnt + 2;
                    }
                }

            }

            sb.append(cnt + "\n");

        }

        System.out.print(sb.toString());

    }
}
