
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String a = "1 2 3 4 5 6 7 8";
        String d = "8 7 6 5 4 3 2 1";

        if(s.equals(a)) {
            System.out.println("ascending");
        }else if(s.equals(d)) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }

    }
}
