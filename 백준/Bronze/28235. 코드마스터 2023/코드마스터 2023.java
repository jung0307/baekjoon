import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (s.equals("CODE")) {
            System.out.println("MASTER");
        } else if (s.equals("2023")) {
            System.out.println("0611");
        } else if (s.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
    }
}
