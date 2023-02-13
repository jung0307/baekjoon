

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            Map<String, Integer> map = new HashMap<>();

            int m = Integer.parseInt(br.readLine());
//            sb.append(m+"\n");

            for(int j = 0; j < m; j++) {
                String s[] = br.readLine().split(" ");
                String uni = s[0];
                int L = Integer.parseInt(s[1]);
//                sb.append(uni+"\n");

                if(map.get(uni) != null) {
                    map.put(uni , map.get(uni) + L);
                }else {
                    map.put(uni , L);
                }

            }

//            sb.append("finished\n");

            Iterator<String> ir = map.keySet().iterator();

            String uniMax = "";
            
            if(ir.hasNext()) {
                uniMax = ir.next();
            }

            while (ir.hasNext()) {
                String s = ir.next();
                if(map.get(uniMax) < map.get(s)) {
                    uniMax = s;
                }

            }
            sb.append(uniMax+"\n");

        }

        System.out.print(sb.toString());

    }
}
