
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {


            String s[] = br.readLine().split(" ");
            ArrayList<Integer> arrInt = new ArrayList<>();

            for(int j = 0; j < 10; j++) {
                arrInt.add(Integer.parseInt(s[j]));
            }

            Collections.sort(arrInt, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            sb.append(arrInt.get(2)+"\n");

        }

        System.out.print(sb.toString());

    }
}
