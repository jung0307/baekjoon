package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main17219 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<String , String> map = new HashMap<>();

        for(int i = 0; i < n; i++) {

            String s1[] = br.readLine().split(" ");

            map.put(s1[0] , s1[1]);

        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            sb.append(map.get(br.readLine())+"\n");
        }

        System.out.print(sb.toString());

    }
}
