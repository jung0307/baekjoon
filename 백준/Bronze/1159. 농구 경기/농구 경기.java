
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character , Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            char name = br.readLine().charAt(0);

            if(map.get(name) == null) {
                map.put(name , 1);
            }else {
                map.put(name , map.get(name) + 1);
            }

        }

        boolean tf = false;

        for(int i = 0; i < 26; i++) {
            if(map.get(  (char)((int)('a') + i)  ) != null) {
                if(map.get(  (char)((int)('a') + i)  ) >= 5) {
                    sb.append((char)((int)('a') + i));
                    tf = true;
                }
            }
        }

        if(tf == true) {
            System.out.println(sb.toString());
        }else {
            System.out.println("PREDAJA");
        }


    }
}
