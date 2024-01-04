import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int arrBridge[] = new int[100 + 1];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int cd = Integer.parseInt(s[0]);

            if(s[1].equals("L")) {
                for(int j = cd - 1; j >= 1; j--) {
                    arrBridge[j]++;
                }
            }else {
                for(int j = cd + 1; j < 101; j++) {
                    arrBridge[j]++;
                }
            }
        }

        double blue = 0;
        double red = 0;
        double green = 0;

        for(int i = 1; i < 101; i++) {
            if(arrBridge[i] % 3 == 0) {
                blue++;
            } else if (arrBridge[i] % 3 == 1) {
                red++;
            }else {
                green++;
            }
        }

        blue = blue / 100 * money;
        red = red / 100 * money;
        green = green / 100 * money;

        System.out.println(String.format("%.2f", blue));
        System.out.println(String.format("%.2f", red));
        System.out.println(String.format("%.2f", green));


    }
}
