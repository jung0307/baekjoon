import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 5;

        Map<Integer , String> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            if(min > Integer.parseInt(s[1])) {
                min = Integer.parseInt(s[1]);
            }

            map.put(Integer.parseInt(s[1]) , s[0]);

        }

        System.out.println(map.get(min));

    }
}
