import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n >= 4) {
            System.out.println(((n - 1) * (n - 2) * (n - 3)) / 6 );
        }else {
            System.out.println("0");
        }



    }
}
