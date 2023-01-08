
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arrInt[] = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < n-1; i++) {

            if(arrInt[arrInt.length - 1 - i] <= arrInt[arrInt.length - 1 - (i+1)]) {
                int j = arrInt[arrInt.length - 1 - i];
                int k = arrInt[arrInt.length - 1 - (i+1)];
                while (j <= k) {
                    k--;
                    count++;
                }
                arrInt[arrInt.length - 1 - (i+1)] = k;
            }

        }

        System.out.println(count);

    }
}
