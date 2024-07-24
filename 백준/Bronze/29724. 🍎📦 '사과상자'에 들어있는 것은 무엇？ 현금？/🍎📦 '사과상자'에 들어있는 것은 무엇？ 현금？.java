import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int g = 0;
        int w = 0;
        int b = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int W = Integer.parseInt(s[1]);
            int H = Integer.parseInt(s[2]);
            int L = Integer.parseInt(s[3]);

            if(s[0].equals("A")) {

                int W_Max = W / 12;
                int H_Max = H / 12;
                int L_Max = L / 12;


                if(W_Max == 0 || H_Max == 0 || L_Max == 0) {
                    g = g + 1000;
                }else {
                    w = w + (4000 * W_Max * L_Max * H_Max);
                    g = g + (500 * W_Max * L_Max * H_Max) + 1000;
                }
            }else {
                b++;
            }
        }

        g = g + (b * 6000);

        System.out.println(g);
        System.out.println(w);

    }
}