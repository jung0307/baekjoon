import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger bi = new BigInteger(br.readLine());
        BigInteger cnt = new BigInteger("0");

        while (true) {
            if(bi.compareTo(cnt) == 0) {
                break;
            }else {
                System.out.println("SciComLove");
                cnt = cnt.add(new BigInteger("1"));
            }
        }

    }
}
