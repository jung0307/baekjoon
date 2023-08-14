import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while (!(s = br.readLine()).equals("0 0 0 0")) {
            String ss[] = s.split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = Integer.parseInt(ss[2]);
            int d = Integer.parseInt(ss[3]);

            sb.append((c - b) + " " + (d - a) + "\n");
        }

        System.out.print(sb.toString());
    }
}
