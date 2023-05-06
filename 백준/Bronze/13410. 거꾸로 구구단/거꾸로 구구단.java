
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i <= b; i++) {
            int c = a * i;
            String ss[] = (c+"").split("");

            for(int j = 0; j < ss.length/2; j++) {
                String temp = ss[ss.length - 1 - j];
                ss[ss.length - 1 - j] = ss[j];
                ss[j] = temp;
            }

            String sss = "";

            for(int j = 0; j < ss.length; j++) {
                sss = sss + ss[j];
            }

            arrayList.add(Integer.parseInt(sss));
        }

        Collections.sort(arrayList);

        System.out.println(arrayList.get(arrayList.size() - 1));



    }
}
