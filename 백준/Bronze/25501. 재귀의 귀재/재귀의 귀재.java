

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int a = 0;

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());


            for(int i = 0; i < n; i++) {
                System.out.println(isPalindrome(br.readLine())+" "+a);
                a = 0;
            }

        }

        public static int recursion(String s, int l, int r){
            a++;
            if(l >= r) return 1;
            else if(s.charAt(l) != s.charAt(r)) return 0;
            else return recursion(s, l+1, r-1);
        }
        public static int isPalindrome(String s){
            return recursion(s, 0, s.length()-1);
        }
}
