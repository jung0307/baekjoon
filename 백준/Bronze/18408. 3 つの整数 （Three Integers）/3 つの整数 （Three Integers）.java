import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int arrInt[] = new int[3];

        for(int i = 0; i < 3; i++) {
            arrInt[Integer.parseInt(s[i])]++;
        }

        if(arrInt[1] >= arrInt[2]) {
            System.out.println("1");
        }else {
            System.out.println("2");
        }

    }
}
