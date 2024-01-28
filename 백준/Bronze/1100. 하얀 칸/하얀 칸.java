import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for(int i = 0 ; i < 8; i++) {
            String s[] = br.readLine().split("");

            for(int j = 0; j < 8; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0 && s[j].equals("F")) {
                        sum++;
                    }
                }else {
                    if(j % 2 == 1 && s[j].equals("F")) {
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);

    }
}
