import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        Map<Integer , String> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        while ((s = br.readLine()) != null) {
            String ss[] = s.split(" ");
            int temp = Integer.parseInt(ss[1]);
            map.put(temp , ss[0]);
            arr.add(temp);
        }

        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(map.get(arr.get(0)));

    }
}
