

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String s0[] = br.readLine().split(" ");
        boolean tf = false;
        int a = 0;
        for(int i = 0; i < s0.length; i++) {
            if(s0[i].equals("0")) {
                a = i+1;
                tf = true;
                break;
            }
        }

        String s[];

        if(tf == true) {
            s = new String[s0.length - a];
        }else{
             s = new String[0];
        }

        int count = 0;

        if(s.length > 0) {

            int b = 0;
            for(int i = a; i < s0.length; i++) {
                s[b++] = s0[i];
            }

            count = 1;
            ArrayList<String> arr = new ArrayList<>();
            arr.add("0");

            int j = 0;
            for(int i = 0; i < s.length; i++) {
                if(arr.get(j).equals("0") && s[i].equals("1")) {
                    count++;
                    j++;
                    arr.add("1");
                }else if(arr.get(j).equals("1") && s[i].equals("2")) {
                    count++;
                    j++;
                    arr.add("2");
                }else if(arr.get(j).equals("2") && s[i].equals("0")) {
                    count++;
                    j++;
                    arr.add("0");
                }
            }
        }else {
            count = 0;
        }

        System.out.println(count);
    }
}
