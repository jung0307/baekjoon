
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        BigInteger a = new BigInteger(s[0]);
        BigInteger b = new BigInteger(s[1]);
        BigInteger c = new BigInteger(s[2]);

        System.out.println(a.add(b).add(c));

    }
}
