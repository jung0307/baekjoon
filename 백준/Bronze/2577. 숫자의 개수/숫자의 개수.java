
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String d = a*b*c+"";
        String arr[] = d.split("");

        int[] arrInt = new int[10];

        for(int i = 0; i < d.length(); i++) {
            arrInt[Integer.parseInt(arr[i])]++;
        }

        for(int i : arrInt) {
            System.out.println(i);
        }

    }
}
