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

            if(a == 0) {
                sb.append((d / (b * c)) + " " + b + " " + c + " " + d + "\n");
            } else if (b == 0) {
                sb.append(a + " " + (d / (a * c)) + " " + c + " " + d + "\n");
            } else if (c == 0) {
                sb.append(a + " " + b + " " + (d / (a * b)) + " " + d + "\n");
            }else {
                sb.append(a + " " + b + " " + c + " " + (a * b * c) + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}
