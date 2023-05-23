

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();

        while ( (s = br.readLine()) != null ) {

            for (int i = 0; i < s.length(); i++) {
                if( (int)s.charAt(i) != 32 ) {
                    arr[(int)s.charAt(i) - 97]++;
                }
            }
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                sb.append((char)(i + 97));
            }
        }

        System.out.print(sb.toString());
    }
}
