
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String p = br.readLine();

        int[] skip = new int[p.length() + 1];
        int pt = 1;
        int pp = 0;

        skip[pt] = 0;
        while (pt != p.length()) {
            if(p.charAt(pt) == p.charAt(pp)) {
                skip[++pt] = ++pp;
            }else if(pp == 0) {
                skip[++pt] = pp;
            }else {
                pp = skip[pp];
            }
        }

        pt = pp = 0;
        while (pt != s.length() && pp != p.length()) {
            if(s.charAt(pt) == p.charAt(pp)) {
                pt++;
                pp++;
            }else if(pp == 0) {
                pt++;
            }else {
                pp = skip[pp];
            }
        }

        if(pp == p.length()) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
