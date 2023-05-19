

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int arrInt[] = new int[10];

            String s[] = br.readLine().split("");
            int count = 0;

            for(int j = 0; j < s.length; j++) {
                arrInt[Integer.parseInt(s[j])]++;
            }

            for(int j = 0; j < arrInt.length; j++) {
                if(arrInt[j] != 0) {
                    count++;
                }
            }

            sb.append(count+"\n");

        }

        System.out.print(sb.toString());
    }
}
