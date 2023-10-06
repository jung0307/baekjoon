import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if(s.equals("M")) {
            System.out.println("MatKor");
        } else if (s.equals("W")) {
            System.out.println("WiCys");
        } else if (s.equals("C")) {
            System.out.println("CyKor");
        } else if (s.equals("A")) {
            System.out.println("AlKor");
        } else if (s.equals("$")) {
            System.out.println("$clear");
        }

    }
}
