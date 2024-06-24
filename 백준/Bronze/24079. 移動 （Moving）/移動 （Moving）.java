import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());
        int y = Integer.parseInt(br.readLine().trim());
        int z = Integer.parseInt(br.readLine().trim());

        if(x + y <= z) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }
}
