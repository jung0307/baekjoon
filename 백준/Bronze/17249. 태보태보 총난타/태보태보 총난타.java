
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        boolean tf = false;
        int l = 0;
        int r = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("(")) {
                tf = true;
            }

            if(tf == false) {
                if(s[i].equals("@")) {
                    l++;
                }
            }else {
                if(s[i].equals("@")) {
                    r++;
                }
            }


        }

        System.out.println(l + " " + r);
    }
}
