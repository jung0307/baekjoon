import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    static int n;
    static int[] parent;
    static int[] count;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
 
        parent = new int[1000001];
        count = new int[1000001];
 
        for (int i = 1; i <= 1000000; i++) {
            parent[i] = i;
            count[i] = 1;
        }
 
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String s1 = s[0];
            if (s1.equals("I")) {
                int a = Math.min(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                int b = Math.max(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                union(a, b);
            } else {
                System.out.println(count[find(Integer.parseInt(s[1]))]);
            }
        }
    }
 
    private static int find(int a) {
        if (a == parent[a]) {
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }
 
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b){
            return;
        }
        count[a]+=count[b];
        parent[parent[b]]=a;
    }
}