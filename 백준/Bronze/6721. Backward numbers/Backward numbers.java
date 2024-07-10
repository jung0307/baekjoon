import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            String c = "";
            for(int j = 0; j < s.length; j++) {
                c = "";
                String ss[] = s[j].split("");

                for(int k = 0; k < ss.length/2; k++) {
                    String temp = ss[k];
                    ss[k] = ss[ss.length - 1 - k];
                    ss[ss.length - 1 - k] = temp;
                }

                for(int k = 0; k < ss.length; k++) {
                    c = c + ss[k];
                }

                if(j == 0) {
                    a = Integer.parseInt(c);
                }else {
                    b = Integer.parseInt(c);
                }

                c = "";

                ss = ((a + b) + "").split("");

                for(int k = 0; k < ss.length/2; k++) {
                    String temp = ss[k];
                    ss[k] = ss[ss.length - 1 - k];
                    ss[ss.length - 1 - k] = temp;
                }

                for(int k = 0; k < ss.length; k++) {
                    c = c + ss[k];
                }

            }
            sb.append(Integer.parseInt(c) + "\n");
        }

        System.out.print(sb.toString());

    }
}