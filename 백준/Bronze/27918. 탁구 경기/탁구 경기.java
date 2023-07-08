import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dal = 0;
        int po = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(dal - po == 2 || po - dal == 2) {
                break;
            }

            if(s.equals("D")) {
                dal++;
            }else {
                po++;
            }

        }

        System.out.println(dal + ":" + po);

    }
}
