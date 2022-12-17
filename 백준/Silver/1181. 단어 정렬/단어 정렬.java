

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            set.add(s);
        }
        String[] arr = (String[])set.toArray(new String[0]);

//        for(String s : arr) {
//            System.out.println(s);
//        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String s : arr) {
            sb.append(s+"\n");
        }
        System.out.print(sb.toString());

    }
}
