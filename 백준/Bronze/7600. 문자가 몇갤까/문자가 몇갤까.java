

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb =new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {
            String s2 = s.toUpperCase();
            int arrInt[] = new int[26];
            int cnt = 0;

            for(int i = 0; i < s2.length(); i++) {
                if((65 <= (int)s2.charAt(i) && (int)s2.charAt(i) <= 90) ) {
                    arrInt[(int)s2.charAt(i) - 65]++;
                }
            }

            for(int i = 0; i < arrInt.length; i++) {
                if(arrInt[i] > 0) {
                    cnt++;
                }
            }

            sb.append(cnt+"\n");

        }

        System.out.print(sb.toString());

    }
}
