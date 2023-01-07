

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        String s1 = s[0];
        String s2 = s[1];
        int n = s2.length() - s1.length() + 1;

        String arr1[] = s1.split("");
        String arr2[] = s2.split("");
        ArrayList<Integer> arrInt = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < arr1.length; j++) {
                if(!arr1[j].equals(arr2[j+i])) {
                    count++;
                }
            }
            arrInt.add(count);
        }
        int min = arrInt.get(0);
        for(int i = 1; i < arrInt.size(); i++) {
            if(min > arrInt.get(i)) {
                min = arrInt.get(i);
            }
        }

        System.out.println(min);
    }
}
