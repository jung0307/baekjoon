import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            String bt[] = br.readLine().split("");
            int bt2[] = new int[n];

            String a = "";
            int b = 0;
            int c = 0;
            int d = 0;
            String e = "";

            for(int j = 0; j < bt.length; j++) {
                c = (j) % 8;
                if(bt[j].equals("I")) {

                    b = b + (int)Math.pow(2 , 7 - c);

                }

                if((j + 1) % 8 == 0) {
                    bt2[d++] = b;
                    b = 0;
                }
            }

            for(int j = 0; j < bt2.length; j++){
                e = e + (char)bt2[j];
            }

            sb.append("Case #"+ (i + 1) +": " + e +"\n");

        }

        System.out.print(sb.toString());

    }
}
