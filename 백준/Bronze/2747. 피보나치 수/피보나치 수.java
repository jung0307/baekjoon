
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt[] = new int[n+1];
        arrInt[0] = 0;
        arrInt[1] = 1;

        if(n >= 2) {
            for(int i = 2; i <= n; i++) {
                arrInt[i] = arrInt[i-1] + arrInt[i-2];
            }
        }

        System.out.println(arrInt[n]);
    }
}
