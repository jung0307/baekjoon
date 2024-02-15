import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split("");
        String ss = br.readLine();
        String s2[] = ss.split("");

        int s2Length = 0;
        String s2_Mirror = "";
        int cnt = 0;

        for(int i = 0; i < s1.length; i++) {

            if(s1[i].equals(s2[s2Length])) {

                s2_Mirror = s2_Mirror + s2[s2Length];
                s2Length = 1;

                if(ss.length() == 1) {
                    s2_Mirror = "";
                    s2Length = 0;
                    cnt++;
                }else {
                    for(int j = i + 1; j < s1.length; j++) {

                        if(s1[j].equals(s2[s2Length])) {
                            s2_Mirror = s2_Mirror + s2[s2Length];
                            s2Length++;
                        }else {
                            s2_Mirror = "";
                            s2Length = 0;
                            break;
                        }

                        if(s2Length == ss.length()) {
                            s2Length = 0;
                            if(s2_Mirror.equals(ss)) {
                                cnt++;
                                s2_Mirror = "";
                                break;
                            }

                        }
                    }
                }
            }
        }

        System.out.println(cnt);

    }
}
