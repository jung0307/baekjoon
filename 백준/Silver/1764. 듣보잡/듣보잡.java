
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int count = 0;
        ArrayList<String> resultArr = new ArrayList<>();

        Map<String,String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s , s);
        }

        for(int i = 0; i < m; i++) {
            String s2 = br.readLine();
            if(map.get(s2) != null){
                count++;
                resultArr.add(s2);
            }
        }

        String[] arr2 = resultArr.toArray(new String[resultArr.size()]);
        Arrays.sort(arr2);

        sb.append(count+"\n");

        for(String c : arr2) {
            sb.append(c+"\n");
        }

        System.out.print(sb.toString());
    }
}
