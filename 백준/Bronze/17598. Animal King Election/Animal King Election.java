import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        int l = 0;

        for(int i = 0; i < 9; i++) {
            String s = br.readLine();

            if(s.equals("Tiger")) {
                t++;
            }else {
                l++;
            }
        }

        if(t >= l) {
            System.out.println("Tiger");
        }else {
            System.out.println("Lion");
        }

    }
}
