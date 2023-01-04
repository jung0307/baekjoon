
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s;
        Set<String> set = new HashSet<>();
        Map<String , Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            s = br.readLine();
            set.add(s);
            if(map.get(s) != null) {
                map.put(s , map.get(s) + 1);
            }else {
                map.put(s , 0);
            }
        }
        int max = -1;
        Iterator<String> ir = set.iterator();
        while (ir.hasNext()) {
            String s2 = ir.next();
            if(max < map.get(s2)) {
                max = map.get(s2);
            }
        }

        int count = 0;
        ArrayList<String> arr = new ArrayList<>();
        Iterator<String> ir2 = set.iterator();
        while (ir2.hasNext()) {
            String s3 = ir2.next();
            if(max == map.get(s3)) {
                arr.add(s3);
                count++;
            }
        }

        String[] arr2 = arr.toArray(new String[arr.size()]);
        Arrays.sort(arr2);

        System.out.println(arr2[0]);



    }
}
