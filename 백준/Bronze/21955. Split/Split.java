import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String a = s.substring(0 , s.length()/2);
        String b = s.substring(s.length()/2);

        System.out.println(a + " " + b);

    }
}
