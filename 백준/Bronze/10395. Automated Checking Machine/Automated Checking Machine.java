import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        boolean tf = false;

        for(int i = 0; i < s1.length; i++) {

            if(s1[i].equals(s2[i])) {
                tf = true;
                break;
            }

        }

        if(tf == false) {
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

    }
}
