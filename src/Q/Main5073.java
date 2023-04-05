package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main5073 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0 0 0") ) {

            String ss[] = s.split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = Integer.parseInt(ss[2]);

            int[] arrInt = new int[3];
            arrInt[0] = a;
            arrInt[1] = b;
            arrInt[2] = c;

            Arrays.sort(arrInt);
            a = arrInt[0];
            b = arrInt[1];
            c = arrInt[2];

            if(c >= b + a) {
                sb.append("Invalid\n");
            }else if(a == b && b == c) {
                sb.append("Equilateral\n");
            }else if((a == b && b != c) || (a != b && b == c)) {
                sb.append("Isosceles\n");
            }else if(a != b && b != c && a != c) {
                sb.append("Scalene\n");
            }

        }

        System.out.print(sb.toString());



    }
}
