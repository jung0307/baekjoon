import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int JOI = 0;
        int IOI = 0;

        for(int i = 1; i < s.length - 1; i++) {
            if(s[i].equals("O")) {
                if(s[i - 1].equals("J") && s[i + 1].equals("I")) {
                    JOI++;
                }else if(s[i - 1].equals("I") && s[i + 1].equals("I")) {
                    IOI++;
                }
            }
        }

        System.out.println(JOI);
        System.out.print(IOI);

    }
}
