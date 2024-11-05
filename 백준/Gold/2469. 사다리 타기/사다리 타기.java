import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
 
 
public class Main {
 
    static int n, k;
    static char[][] map;
    static char[] top;
    static int targetLayer;
    static char[] want;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
 
        map = new char[k][n - 1];
        want = new char[n];
        top = new char[n];
 
 
        String s1 = br.readLine();
 
 
        for (int i = 0; i < s1.length(); i++) {
            want[i] = s1.charAt(i);
            top[i] = (char) ('A' + i);
        }
 
        for (int i = 0; i < k; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '?') {
                    targetLayer = i;
                    Arrays.fill(map[i], '?');
                    continue;
                }
                map[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < targetLayer; i++) {
            makeNext(i);
        }
 
        for (int i = k - 1; i > targetLayer; i--) {
            makePrev(i);
        }
 
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < n - 1; i++) {
            if (top[i] != want[i]) {
                if(top[i]!=want[i+1]){
                    sb.delete(0,sb.length());
                    for(int j=0; j<n-1; j++){
                        sb.append("x");
                    }
                    break;
                }
                sb.append("-");
                i+=1;
                if(i<n-1){
                    sb.append("*");
                }
                continue;
            }
            sb.append("*");
        }
        System.out.println(sb.toString());
 
    }
 
        private static void makePrev ( int index){
            for (int i = 0; i < n - 1; i++) {
                char now = map[index][i];
                if (now == '-') {
                    char prev = want[i];
                    want[i] = want[i + 1];
                    want[i + 1] = prev;
                }
            }
        }
 
        private static void makeNext ( int index){
            for (int i = 0; i < n - 1; i++) {
                char now = map[index][i];
                if (now == '-') {
                    char prev = top[i + 1];
                    top[i + 1] = top[i];
                    top[i] = prev;
                }
            }
        }
    }