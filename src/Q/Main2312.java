package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2312 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            int a = Integer.parseInt(br.readLine());
            int b = 2;

            Map<Integer , Integer> map = new HashMap<>();
            boolean tf = false;

            while (a >= b) {

                if(a%b == 0) {
                    a = a/b;
                    if(tf == false) {
                        tf = true;
                        map.put(b , 1);
                    }else {
                        map.put(b , map.get(b) + 1);
                    }

                }else {
                    b++;
                    tf = false;
                }


            }

            Iterator<Integer> ir = map.keySet().iterator();
            ArrayList<Integer> arr2 = new ArrayList<>();
            while(ir.hasNext()) {
                int key = ir.next();
                arr2.add(key);
            }
            Collections.sort(arr2);

            for(int j = 0; j < arr2.size(); j++) {
                sb.append(arr2.get(j) +" "+ map.get(arr2.get(j))+"\n");
            }
        }

        System.out.print(sb.toString());

    }
}
