
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrInt = new int[4];

        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        arrInt[0] = b;

        for(int i = 1; i < 3; i++) {
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);

            arrInt[i] = b-a + arrInt[i-1];
        }
        s = br.readLine().split(" ");

        Arrays.sort(arrInt);

        System.out.println(arrInt[arrInt.length-1]);
    }
}
