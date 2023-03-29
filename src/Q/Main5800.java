package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main5800 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            ArrayList<Integer> arr = new ArrayList<>();
            String s[] = br.readLine().split(" ");

            for(int j = 1; j < s.length; j++) {
                arr.add(Integer.parseInt(s[j]));
            }

            Collections.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            int gap = 0;

            for(int k = 0; k < arr.size() - 1; k++) {
                if(gap < arr.get(k) - arr.get(k+1)) {
                    gap = arr.get(k) - arr.get(k+1);
                }
            }

            sb.append("Class " + (i+1) +"\n");
            sb.append("Max "+arr.get(0)+", Min "+arr.get(arr.size()-1)+", Largest gap "+gap+"\n");
        }

        System.out.print(sb.toString());

    }
}
