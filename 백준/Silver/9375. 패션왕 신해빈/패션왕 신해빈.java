
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String[][] arr = new String[m][2];
            for(int j = 0; j < m; j++) {
                String s[] = br.readLine().split(" ");
                arr[j][0] = s[0];
                arr[j][1] = s[1];
            }
            Set<String> set = new HashSet<>();
            for(int j = 0; j < m; j++) {
                //System.out.println(arr[j][1]+"0000000");
                set.add(arr[j][1]);
            }

            Iterator<String> ir = set.iterator();
            Map<String, Integer> map = new HashMap<>();
            ArrayList<String> arr2 = new ArrayList<>();

            while (ir.hasNext()) {
                String ss = ir.next();
                //System.out.println(ss+"9999999");
                arr2.add(ss);
                map.put(ss , 0);
            }

            for(int j = 0; j < m; j++) {
                for(int k = 0; k < arr2.size(); k++) {
                    if(arr2.get(k).equals(arr[j][1])) {
                        map.put(arr2.get(k),map.get(arr2.get(k))+1 );
                    }
                }
            }

            int sum = 1;
            ArrayList<Integer> arrInt = new ArrayList<>();
            for(String s : arr2) {
                arrInt.add(map.get(s) + 1);
            }
            for(int c = 0; c < arrInt.size(); c++) {
                sum = sum  * arrInt.get(c);
            }
            sb.append(sum - 1 + "\n");

        }
        System.out.print(sb.toString());
    }
}
