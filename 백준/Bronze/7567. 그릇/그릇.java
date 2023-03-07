

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");

        int sum = 10;

        for(int i = 0; i < s.length-1; i++) {

            if(s[i].equals(s[i+1])) {
                sum = sum + 5;
            }else {
                sum = sum + 10;
            }

        }

        System.out.println(sum);

    }
}
