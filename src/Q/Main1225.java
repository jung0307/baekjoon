package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1225 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        long sum = 0;

        for(int i = 0; i < s[0].length(); i++) {

            for(int j = 0; j < s[1].length(); j++) {
                int n = Character.getNumericValue(s[0].charAt(i));
                int m = Character.getNumericValue(s[1].charAt(j));

                sum = sum + n * m;
            }

        }

        System.out.println(sum);
    }
}
