
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split( " ");
        Map<String , String> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],arr[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String arr2[] = br.readLine().split( " ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            if(map.get(arr2[i]) != null) {
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }
        }

        System.out.print(sb.toString());

    }
}
