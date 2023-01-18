
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long arrLong[] = new long[1000001];
        arrLong[1] = 1;
        arrLong[2] = 2;

        for(int i = 3; i < arrLong.length; i++) {
            arrLong[i] = -1;
        }

        if(arrLong[n] == -1) {
            for(int i = 3; i < arrLong.length; i++) {
                arrLong[i] = (arrLong[i-2] + arrLong[i-1])%15746;
            }
        }

        System.out.println(arrLong[n]);

    }
}
