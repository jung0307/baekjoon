import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split("");
        boolean tf = false;

        for(int i = 0; i < n - 1; i++) {
            if(!s[i].equals(s[i + 1])) {
                tf = true;
                break;
            }
        }

        if(tf == true) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }
}
