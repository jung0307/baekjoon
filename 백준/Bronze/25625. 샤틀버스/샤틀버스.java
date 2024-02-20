import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        int z = y % x;

        if(x <= y) {
            System.out.println(z);
        }else {
            System.out.println(x + y);
        }
        
    }
}
