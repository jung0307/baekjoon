import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sn = br.readLine();
        int n = Integer.parseInt(sn);

        int answer = 0;

        String srn;
        String sln;

        String srn2;
        String sln2;

        if(n == 99 || n == 999 || n == 9999) {
            answer = n;
        }else {

            int rn = n + 1;
            int ln = n - 1;

            while (true) {

                srn = rn + "";
                sln = ln + "";

                srn2 = "";
                sln2 = "";

                if(srn.length() > 1) {
                    for(int i = 0; i < 2; i++) {
                        srn2 = srn2 + srn.charAt(srn.length() - 1 - i);
                    }
                }

                if(sln.length() > 1) {
                    for(int i = 0; i < 2; i++) {
                        sln2 = sln2 + sln.charAt(sln.length() - 1 - i);
                    }
                }

                if(srn2.equals("99")) {
                    answer = rn;
                    break;
                }
                if(sln2.equals("99")) {
                    answer = ln;
                    break;
                }

                rn = rn + 1;
                ln = ln - 1;

            }

        }

        System.out.println(answer);

    }
}
