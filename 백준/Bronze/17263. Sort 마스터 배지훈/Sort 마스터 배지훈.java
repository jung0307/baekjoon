
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        ArrayList<Integer> arrInt = new ArrayList<>();

        for(int i = 0; i < s.length; i++) {
            arrInt.add(Integer.parseInt(s[i]));
        }

        Collections.sort(arrInt);

        System.out.println(arrInt.get(arrInt.size() - 1));

    }
}
