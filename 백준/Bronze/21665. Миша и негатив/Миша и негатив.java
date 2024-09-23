import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int cnt = 0;

        String arr[][] = new String[A][B];

        for(int i = 0; i < A; i++) {
            String ss[] = br.readLine().split("");

            for(int j = 0; j < B; j++) {
                arr[i][j] = ss[j];
            }
        }

        br.readLine();

        for(int i = 0; i < A; i++) {
            String ss[] = br.readLine().split("");

            for(int j = 0; j < B; j++) {
                if(arr[i][j].equals("W") && ss[j].equals("B") || arr[i][j].equals("B") && ss[j].equals("W")) {

                }else {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
