
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] arrInt = new int[n];

        int i = 0;
        for(String s : arr) {
            arrInt[i++] = Integer.parseInt(s);
        }

        Arrays.sort(arrInt);

        System.out.println(arrInt[0] * arrInt[arrInt.length-1]);

    }
}
