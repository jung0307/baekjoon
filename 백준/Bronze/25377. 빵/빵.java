

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Boolean[] arrBoo = new Boolean[n];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            arrBoo[i] = true;
        }

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(i == 0) {
                answer = b;
            }

            if(a > b) {
                arrBoo[i] = false;
            }else {
                if(answer > b) {
                    answer = b;
                }
            }

        }

        int j = 0;

        for(int i = 0; i < n; i++) {
            if(arrBoo[i] == false) {
                j++;
            }
        }

        if(j == n) {
            System.out.println("-1");
        }else {
            System.out.println(answer);
        }

    }
}
