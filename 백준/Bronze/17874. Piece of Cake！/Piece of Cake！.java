import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        int v = Integer.parseInt(s[2]);

        int H = Math.max(h , n - h);
        int V = Math.max(v , n - v);

        System.out.println(H * V * 4);

    }
}
