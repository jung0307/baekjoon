

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
        int count = 0;

        Map<String , String> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(br.readLine() , "0");
        }

        for(int i = 0; i < m; i++) {
            if(map.get(br.readLine()) != null) {
                count++;
            }
        }

        System.out.println(count);

    }
}
