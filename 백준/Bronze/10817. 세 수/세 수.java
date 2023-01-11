
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int[] arrInt = new int[s.length];
        int a = 0;
        for(String s1 : s) {
            arrInt[a++] = Integer.parseInt(s1);
        }

        Arrays.sort(arrInt);
        System.out.println(arrInt[1]);

    }
}
