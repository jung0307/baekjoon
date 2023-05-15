
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer , Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(map.get(a) == null) {
                map.put(a , b);
            } else if (map.get(a) != b) {
                sum++;
                map.put(a , b);
            }
        }

        System.out.println(sum);


    }
}
