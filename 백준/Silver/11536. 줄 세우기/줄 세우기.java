import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = "";

        String ss[] = new String[n];
        String aa[] = new String[n];

        for(int i = 0; i < n; i++) {
            s = br.readLine();
            ss[i] = s;
            aa[i] = s;
        }

        Arrays.sort(aa);

        boolean tf = false;

        for(int i = 0; i < n; i++) {
            if(!ss[i].equals(aa[i])) {
                tf = true;
                break;
            }
        }

        if(tf == false) {
            System.out.println("INCREASING");
        }else {
            boolean tf2 = false;

            for(int i = 0; i < n; i++) {
                if(!ss[i].equals(aa[aa.length - 1 - i])) {
                    tf2 = true;
                    break;
                }
            }

            if(tf2 == true) {
                System.out.println("NEITHER");
            }else {
                System.out.println("DECREASING");
            }
        }



    }
}
