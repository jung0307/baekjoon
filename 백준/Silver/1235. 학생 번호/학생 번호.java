

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        Map<String , String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        for(int i = 1; i <= s[0].length(); i++) {

            boolean tf = false;

            for(int j = 0; j < n; j++) {

                String a = s[j];
                String b = "";

                for(int k = 0; k < i; k++) {
                    b = a.charAt(s[0].length() - 1 - k) + b;
                }

                if(map.get(b) != null) {
                    tf = true;
                    break;
                }else {
                    map.put(b , b);
                }

            }

            if(tf == false) {
                System.out.println(i);
                break;
            }

        }

    }
}
