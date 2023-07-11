import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        int i = 0;

        while ( (s = br.readLine()) != null ) {
            i++;
        }
        
        System.out.println(i);

    }
}
