import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int arrInt[] = new int[26];

        for(int i = 0; i < s.length; i++) {
            arrInt[(int) s[i].charAt(0) - 65]++;
        }

        if(arrInt[1] >= 1 && arrInt[8] >= 1 && arrInt[12] >= 1 && arrInt[14] >= 1 && arrInt[18] >= 1) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
