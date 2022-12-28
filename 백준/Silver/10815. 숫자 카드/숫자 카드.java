
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String arr2[] = br.readLine().split(" ");

        Map<String , String> map1 = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            map1.put(arr[i] , "0");
        }

        for(int i = 0; i < m; i++) {
            if(map1.get(arr2[i]) != null) {
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());

    }
}
