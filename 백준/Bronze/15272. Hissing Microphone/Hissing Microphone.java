import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.contains("ss")) {
            System.out.println("hiss");
        }else {
            System.out.println("no hiss");
        }



    }
}
