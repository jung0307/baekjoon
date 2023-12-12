import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        boolean tf = false;

        for(int i = 0; i < s.length; i++) {

            String a = s[i];

            for(int j = i + 1; j < s.length; j++) {

                if(s[j].equals(a)) {
                    tf = true;
                    break;
                }

            }

            if(tf == true) {
                break;
            }

        }

        if(tf == false) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
