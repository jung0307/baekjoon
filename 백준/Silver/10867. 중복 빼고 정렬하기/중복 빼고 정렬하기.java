
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s[] = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < s.length; i++) {
            set.add(Integer.parseInt(s[i]));
        }

        Iterator<Integer> ir = set.iterator();
        ArrayList<Integer> arrInt = new ArrayList<>();
        while (ir.hasNext()) {
            arrInt.add(ir.next());
        }

        Collections.sort(arrInt);

        StringBuilder sb = new StringBuilder();

        for(Integer a : arrInt) {
            sb.append(a+" ");
        }

        System.out.println(sb.toString());

    }
}
