
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n == 0) {
            System.out.println("YONSEI");
        }else {
            System.out.println("Leading the Way to the Future");
        }

    }
}
