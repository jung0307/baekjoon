import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int cnt = 0;

        for(int i = Integer.parseInt(s[0]); i <= Integer.parseInt(s[1]); i++) {
            String a[] = Integer.toString(i).split("");

            for(int j = 0; j < a.length; j++) {
                if(a[j].equals(s[2])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
