import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        ArrayList<Integer> arrInt1 = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();

        for(int i = 0; i < s1.length; i++) {
            arrInt1.add(Integer.parseInt(s1[i]));
        }
        for(int i = 0; i < s2.length; i++) {
            arrInt2.add(Integer.parseInt(s2[i]));
        }

        Collections.sort(arrInt1);
        Collections.sort(arrInt2);

        System.out.println(arrInt1.get(arrInt1.size() - 1) + arrInt2.get(arrInt2.size() - 1));


    }
}
