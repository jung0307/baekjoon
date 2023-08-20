import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "N";

        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            if(s.equals("N")) {
                if(n == 1) {
                    s = "E";
                } else if (n == 2) {
                    s = "S";
                }else {
                    s = "W";
                }
            } else if (s.equals("E")) {
                if(n == 1) {
                    s = "S";
                } else if (n == 2) {
                    s = "W";
                }else {
                    s = "N";
                }
            } else if (s.equals("S")) {
                if(n == 1) {
                    s = "W";
                } else if (n == 2) {
                    s = "N";
                }else {
                    s = "E";
                }
            } else if (s.equals("W")) {
                if(n == 1) {
                    s = "N";
                } else if (n == 2) {
                    s = "E";
                }else {
                    s = "S";
                }
            }

        }

        System.out.println(s);

    }
}
