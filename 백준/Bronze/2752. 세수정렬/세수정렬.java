
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int[] arrInt = new int[3];

        for(int i = 0; i < 3; i++) {
          arrInt[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arrInt);

        for(int i = 0; i < 2; i++) {
            System.out.print(arrInt[i]+" ");
        }
        System.out.print(arrInt[arrInt.length-1]);
    }
}
