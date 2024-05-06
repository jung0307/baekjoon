import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        boolean tf = false;

        for(int i = 0; i < a; i++) {

            if(i % 2 == 0) {
                tf = false;
            }else {
                tf = true;
            }

            for(int j = 0; j < b; j++) {

                if(tf == false) {
                    if(j % 2 == 0) {
                        sb.append("*");
                    }else {
                        sb.append(".");
                    }
                }else {
                    if(j % 2 == 0) {
                        sb.append(".");
                    }else {
                        sb.append("*");
                    }
                }

            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
