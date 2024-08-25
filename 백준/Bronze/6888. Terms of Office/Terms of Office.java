import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int j = 1;

        sb.append("All positions change in year " + X + "\n");

        for(int i = X + 1; i <= Y; i++) {
            if(j % 60 == 0) {
                sb.append("All positions change in year " + i + "\n");
                j = 0;
            }
            j++;
        }

        System.out.print(sb.toString());

    }
}
