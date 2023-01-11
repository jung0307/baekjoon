
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int arrInt[] = new int[10];

        for(int i = 0; i < s.length; i++) {
            arrInt[Integer.parseInt(s[i])] = arrInt[Integer.parseInt(s[i])] + 1;
        }

        int max = arrInt[0];
        int n = 0;

        for(int i = 1; i < arrInt.length; i++) {
            if(max < arrInt[i]) {
                max = arrInt[i];
                n = i;
            }
        }

        if(n == 6 || n == 9) {
            int max2 = arrInt[0];
            int n2 = 0;
            for(int i = 1; i < arrInt.length; i++) {
                if(max2 < arrInt[i] && i != 6 && i != 9) {
                    max2 = arrInt[i];
                    n2 = i;
                }
            }

            int sum69 = arrInt[6] + arrInt[9];
            int result = sum69 - 2*arrInt[n2];

            if(result < 0) {
                System.out.println(max2);
            }else {
                if(result%2 == 1) {
                    System.out.println(max2 + result/2 + 1);
                }else {
                    System.out.println(max2 + result/2);
                }
            }


        }else {
            System.out.println(max);
        }

    }
}
