import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < 4; i++) {
            sum1 = sum1 + Integer.parseInt(s1[i]);
            sum2 = sum2 + Integer.parseInt(s2[i]);
        }

        if(sum1 >= sum2) {
            System.out.println(sum1);
        }else {
            System.out.println(sum2);
        }

    }
}
