
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a[] = br.readLine().split("");
        String b[] = br.readLine().split("");

        int a2 = 0;
        int b2 = 0;

        for(int i = a.length - 1; i >= 0; i--) {
            a2 = a2 + (int)Math.pow(2 , a.length - 1 - i ) * Integer.parseInt(a[i]);
        }

        for(int i = b.length - 1; i >= 0; i--) {
            b2 = b2 + (int)Math.pow(2 , b.length - 1 - i ) * Integer.parseInt(b[i]);
        }

        //System.out.println(a2 + " " + b2);

        BigInteger c2 = new BigInteger(a2+"").multiply(new BigInteger(b2+""));

        //System.out.println(c2.toString());
        StringBuilder sb = new StringBuilder();

        int d = 0;

        while (!c2.equals(new BigInteger("0"))) {
            //System.out.println(d++ + " " + c2.remainder(new BigInteger("2")));
            sb.append(c2.remainder(new BigInteger("2")));
            c2 = c2.divide(new BigInteger("2"));
            //System.out.println(c2.toString());
        }
//        long c2 = a2 * b2;
//        System.out.println(c2);
//        StringBuilder sb = new StringBuilder();
//
//        while (c2 != 0) {
//            long re = c2 % 2;
//            c2 = c2/2;
//
//            sb.append(re);
//        }

        System.out.println(sb.reverse().toString());
//정답        11110100110011011101111010001100000000101001000111010000000000
//내꺼        11110100110011011101111010001100000000101001000111010100000000


//정답        4410000002100000000
//내꺼        4410000002100000000

    }
}
