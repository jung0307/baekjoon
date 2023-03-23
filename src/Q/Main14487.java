package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14487 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int sum = 0;

//        if(Math.max(Integer.parseInt(s[1]) , Integer.parseInt(s[s.length-1])) == Integer.parseInt(s[1]) ) {
//
//            for(int i = 0; i < s.length; i++) {
//                if(i != 1) {
//                    sum = sum + Integer.parseInt(s[i]);
//                }
//            }
//
//        }else {
//            for(int i = 0; i < s.length; i++) {
//                if(i != s.length-1) {
//                    sum = sum + Integer.parseInt(s[i]);
//                }
//            }
//        }
        int max = Integer.parseInt(s[0]);
        for(int i = 1; i < s.length; i++) {
            if(max < Integer.parseInt(s[i])) {
                max = Integer.parseInt(s[i]);
            }
        }

        for(int i = 0; i < s.length; i++) {
            sum = sum + Integer.parseInt(s[i]);
        }

        System.out.println(sum - max);

    }
}
