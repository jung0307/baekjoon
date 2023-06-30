
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s0[] = br.readLine().split(" ");

        String s1[] = s0[0].split(":");
        String s2[] = s0[1].split(":");
        String s3[] = s0[2].split(":");
        
        int a = Integer.parseInt(s1[0]) * 60 + Integer.parseInt(s1[1]);
        int b = Integer.parseInt(s2[0]) * 60 + Integer.parseInt(s2[1]);
        int c = Integer.parseInt(s3[0]) * 60 + Integer.parseInt(s3[1]);

        Map<String,Boolean> map = new HashMap<>();

        String s = "";
        int cnt = 0;

        while ( (s = br.readLine()) != null) {
            String ss[] = s.split(" ");
            String ss1[] = ss[0].split(":");
            String name = ss[1];

            int A = Integer.parseInt(ss1[0]) * 60 + Integer.parseInt(ss1[1]);

            if(A <= a) {
                if(map.get(name) == null) {
                    map.put(name , false);
                }
            } else if (b <= A && A <= c) {
                if(map.get(name) == null) {

                }else {
                    if(map.get(name) == false) {
                        cnt++;
                        map.put(name , true);
                    }
                }
            }

        }

        System.out.println(cnt);
    }
}
