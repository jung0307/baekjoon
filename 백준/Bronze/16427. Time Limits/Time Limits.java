import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ss[] = br.readLine().split(" ");

        int n = Integer.parseInt(ss[0]);
        int s = Integer.parseInt(ss[1]);

        String m[] = br.readLine().split(" ");
        int max = Integer.parseInt(m[0]);

        for(int i = 1; i < m.length; i++) {
            if(Integer.parseInt(m[i]) >= max) {
                max = Integer.parseInt(m[i]);
            }
        }

        System.out.println((int)Math.ceil((double) max * s / 1000));;



    }
}
