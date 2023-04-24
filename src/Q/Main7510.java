package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main7510 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {

            String s[] = br.readLine().split(" ");

            ArrayList<Integer> arrInt = new ArrayList<>();
            arrInt.add(Integer.parseInt(s[0]));
            arrInt.add(Integer.parseInt(s[1]));
            arrInt.add(Integer.parseInt(s[2]));

            Collections.sort(arrInt);

            int z = (int)Math.pow(arrInt.get(2) , 2);
            int y = (int)Math.pow(arrInt.get(1) , 2);
            int x = (int)Math.pow(arrInt.get(0) , 2);

            sb.append("Scenario #"+i+":\n");

            if(i != n) {
                if(z == y + x) {
                    sb.append("yes\n");
                }else {
                    sb.append("no\n");
                }
                sb.append("\n");
            }else {
                if(z == y + x) {
                    sb.append("yes");
                }else {
                    sb.append("no");
                }
            }
        }

        System.out.print(sb.toString());

    }
}
