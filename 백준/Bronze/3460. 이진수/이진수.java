

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrInt = new ArrayList<>();
            ArrayList<Integer> arrInt2 = new ArrayList<>();

            while (a != 0) {
                arrInt.add(a%2);
                a = a/2;
            }

            for(int j = 0 ; j < arrInt.size(); j++) {
                if(arrInt.get(j) == 1) {
                    arrInt2.add(j);
                }
            }

            for(int j = 0; j < arrInt2.size() - 1; j++) {
                sb.append(arrInt2.get(j) + " ");
            }

            sb.append(arrInt2.get(arrInt2.size() - 1)+"\n");
        }

        System.out.print(sb.toString());
    }
}
