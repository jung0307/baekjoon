import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ss = br.readLine();
        String s[] = ss.split("");

        StringBuilder sb = new StringBuilder();

        int index_U = 0;
        int index_F = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("U")) {
                index_U = i;
                break;
            }
        }

        for(int i = s.length - 1; i >= 0; i--) {
            if(s[i].equals("F")) {
                index_F = i;
                break;
            }
        }

        for(int i = 0; i < index_U; i++) {
            sb.append("-");
        }

        sb.append("U");

        for(int i = index_U + 1; i < index_F; i++) {
            sb.append("C");
        }

        sb.append("F");

        for(int i = index_F + 1; i < s.length; i++) {
            sb.append("-");
        }

        System.out.print(sb.toString());



    }
}
