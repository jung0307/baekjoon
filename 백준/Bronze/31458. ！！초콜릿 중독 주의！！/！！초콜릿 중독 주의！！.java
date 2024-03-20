import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");

            boolean tf = false;
            int num = 0;
            int leftSign = 0;
            int rightSign = 0;

            for(int j = 0; j < s.length; j++) {
                if(!s[j].equals("!") && tf == false) {
                    num = Integer.parseInt(s[j]);
                    tf = true;
                } else if (s[j].equals("!") && tf == false) {
                    leftSign++;
                } else if (s[j].equals("!") && tf == true) {
                    rightSign++;
                }
            }

            if(num == 0) {
                if(rightSign >= 1) {
                    num = 1;
                }
            }

            if(leftSign % 2 != 0) {
                if(num == 1) {
                    num = 0;
                }else {
                    num = 1;
                }
            }

            sb.append(num + "\n");
        }

        System.out.print(sb.toString());

    }
}
