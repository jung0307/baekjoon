import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        Set<String> set = new HashSet<>();
        set.add(s1[0]);
        set.add(s1[1]);
        set.add(s2[0]);
        set.add(s2[1]);

        ArrayList<String> arr = new ArrayList<>(set);

        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                sb.append(arr.get(i) + " " + arr.get(j) + "\n");
            }
        }

        System.out.print(sb.toString());
    }
}
