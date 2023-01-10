
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = 1;

        int x;
        int y;
        int z;

        while (true) {

            x = d%15+1;
            y = d%28+1;
            z = d%19+1;
            d++;

            if(x == a && y == b && z == c) {
                break;
            }
        }

        if(a == 1 && b == 1 && c == 1){
            System.out.println(1);
        }else {
            System.out.println(d);
        }

    }
}
