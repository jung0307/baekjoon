
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        int arrInt[] = new int[N];
        arrInt[X - 1] = 1;

        for(int i = 0; i < K; i++) {
            String ss[] = br.readLine().split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int temp = 0;

            temp = arrInt[a - 1];
            arrInt[a - 1] = arrInt[b - 1];
            arrInt[b - 1] = temp;
        }

        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
