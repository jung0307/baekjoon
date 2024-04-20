import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = B * 7;

        if(A + C >= 31) {
            System.out.println("0");
        }else {
            System.out.println("1");
        }

    }
}
