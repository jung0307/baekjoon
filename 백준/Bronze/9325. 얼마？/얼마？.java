import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int price = Integer.parseInt(br.readLine());
            int totalPrice = price;

            int m = Integer.parseInt(br.readLine());

            for(int j = 0; j < m; j++) {
                String ss[] = br.readLine().split(" ");

                totalPrice = totalPrice + Integer.parseInt(ss[0]) * Integer.parseInt(ss[1]);
            }

            sb.append(totalPrice + "\n");
        }

        System.out.print(sb.toString());



    }
}
