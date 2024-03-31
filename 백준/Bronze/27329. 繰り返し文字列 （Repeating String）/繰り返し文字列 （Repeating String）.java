import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        String s1 = s.substring(0 , n/2);
        String s2 = s.substring(n/2);

        if(s1.equals(s2)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
