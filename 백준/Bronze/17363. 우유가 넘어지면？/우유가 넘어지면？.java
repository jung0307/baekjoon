import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        String ss[][] = new String[a][b];
        String ss2[][] = new String[b][a];

        for(int i = 0; i < a; i++) {

            String sss[] = br.readLine().split("");

            for(int j = 0; j < b; j++) {
                ss[i][j] = sss[j];
            }

        }

        for(int i = 0; i < b; i++) {

            for(int j = 0; j < a; j++) {

                if(ss[j][i].equals("-")) {
                    ss2[i][j] = "|";
                } else if (ss[j][i].equals("|")) {
                    ss2[i][j] = "-";
                } else if (ss[j][i].equals("/")) {
                    ss2[i][j] = "\\";
                } else if (ss[j][i].equals("\\")) {
                    ss2[i][j] = "/";
                } else if (ss[j][i].equals("^")) {
                    ss2[i][j] = "<";
                } else if (ss[j][i].equals("<")) {
                    ss2[i][j] = "v";
                } else if (ss[j][i].equals("v")) {
                    ss2[i][j] = ">";
                } else if (ss[j][i].equals(">")) {
                    ss2[i][j] = "^";
                } else {
                    ss2[i][j] = ss[j][i];
                }
            }

        }

        for(int i = b - 1; i >= 0; i--) {
            for(int j = 0; j < a; j++) {
                System.out.print(ss2[i][j]);
            }
            System.out.println();
        }
    }
}
