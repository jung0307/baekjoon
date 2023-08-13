import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0 0") ) {
            String ss[] = s.split(" ");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);

            int arrInt[] = new int[3];

            arrInt[0] = a * 30 + b * 40;
            arrInt[1] = a * 35 + b * 30;
            arrInt[2] = a * 40 + b * 20;

            Arrays.sort(arrInt);

            sb.append(arrInt[0] + "\n");
        }

        System.out.print(sb.toString());

    }
}
