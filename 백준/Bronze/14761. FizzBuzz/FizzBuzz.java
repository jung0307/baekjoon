import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(s[0]);
        int Y = Integer.parseInt(s[1]);
        int N = Integer.parseInt(s[2]);

        for (int i = 1; i <= N; i++) {
            if(i % X == 0 && i % Y == 0) {
                sb.append("FizzBuzz\n");
            } else if (i % X == 0) {
                sb.append("Fizz\n");
            }else if(i % Y == 0){
                sb.append("Buzz\n");
            }else {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}