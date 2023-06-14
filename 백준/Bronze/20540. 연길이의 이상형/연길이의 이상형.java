

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("E")) {
                sb.append("I");
            } else if (s[i].equals("S")) {
                sb.append("N");
            } else if (s[i].equals("F")) {
                sb.append("T");
            } else if (s[i].equals("P")) {
                sb.append("J");
            } else if (s[i].equals("I")) {
                sb.append("E");
            } else if (s[i].equals("N")) {
                sb.append("S");
            } else if (s[i].equals("T")) {
                sb.append("F");
            } else if (s[i].equals("J")) {
                sb.append("P");
            }
        }

        System.out.print(sb.toString());


    }
}
