import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int arrInt[] = {Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2])};

        Arrays.sort(arrInt);

        System.out.println(arrInt[1]);

    }
}
