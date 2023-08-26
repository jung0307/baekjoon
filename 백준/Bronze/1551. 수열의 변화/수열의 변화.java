import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(",");

        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);

        ArrayList<Integer> arrInt = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s2.length; i++) {
            arrInt.add(Integer.parseInt(s2[i]));
        }

        for(int i = 0; i < k; i++) {

            for(int j = 0; j < arrInt.size() - 1; j++) {
                arrInt2.add(arrInt.get(j+1) - arrInt.get(j));
            }

            arrInt = arrInt2;
            arrInt2 = new ArrayList<>();

        }

        for(int i = 0; i < arrInt.size() - 1; i++) {
            sb.append(arrInt.get(i) + ",");
        }

        sb.append(arrInt.get(arrInt.size() - 1));

        System.out.println(sb.toString());

    }
}
