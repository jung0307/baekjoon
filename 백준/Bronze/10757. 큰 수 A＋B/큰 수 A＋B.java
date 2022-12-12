import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        BigInteger b1 = new BigInteger(arr[0]);
        BigInteger b2 = new BigInteger(arr[1]);

        System.out.println(b1.add(b2));


    }

}

