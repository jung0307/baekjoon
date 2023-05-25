
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        double a = Double.parseDouble(s[0]) / Double.parseDouble(s[1]);

        int n = Integer.parseInt(br.readLine());

        double min = a;

        for(int i = 0; i < n; i++) {
            String ss[] = br.readLine().split(" ");

            double b = Double.parseDouble(ss[0]) / Double.parseDouble(ss[1]);

            if(b < min) {
                min = b;
            }
        }

        System.out.println(String.format("%.2f" , min * 1000));

    }
}
