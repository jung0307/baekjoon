
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Map<String , String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i <= n; i++) {
            String s = br.readLine();;
            map.put(s, i+"");
            map.put(i+"" , s);
        }

        for(int i = 0; i < m; i++) {
            sb.append(map.get(br.readLine()) +"\n");
        }

        System.out.print(sb.toString());
    }
}
