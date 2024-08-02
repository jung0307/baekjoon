import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = (int)(Math.max(Integer.parseInt(s[0]) , Integer.parseInt(s[1]))) - (int)(Math.min(Integer.parseInt(s[0]) , Integer.parseInt(s[1])));
        int b = (int)(Math.min(Integer.parseInt(s[0]) , Integer.parseInt(s[1])));

        while (a != b) {

            int temp = 0;

            temp = (int)(Math.max(a , b) - Math.min(a , b));
            b = (int)(Math.min(a , b));
            a = temp;
        }

        System.out.println(a);
    }

}
