
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int z = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < z; i++) {
            String arr[] = br.readLine().split(" ");
            String m = arr[0];
            String n = arr[1];
            int nm = Integer.parseInt(n) - Integer.parseInt(m);
            BigInteger bn = new BigInteger(n);
            BigInteger bm = new BigInteger(m);
            BigInteger bnm = new BigInteger(nm+"");

            BigInteger a = solution(bn).divide(solution(bm).multiply(solution(bnm)));
            sb.append(a +"\n");
        }
        System.out.print(sb.toString());

    }

    static BigInteger solution(BigInteger s) {
        if(s.compareTo(new BigInteger("0")) == 1) {
            BigInteger z = solution(s.subtract(new BigInteger("1")));
            return s.multiply(z);
        }else{
            return new BigInteger("1");
        }
    }
}
