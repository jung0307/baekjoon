import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if(a * 7 > b * 13) {
            System.out.println("Axel");
        } else if (a * 7 < b * 13) {
            System.out.println("Petra");
        }else {
            System.out.println("lika");
        }
    }
}
