import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int arr[];
    static boolean v[];
    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        arr = new int[N + 1];
        v = new boolean[N + 1];

        String s2[] = br.readLine().split(" ");

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(s2[i - 1]);
        }

        Arrays.sort(arr);
        solution(M , "");

        Iterator<String> ir = set.iterator();

        while (ir.hasNext()) {
            sb.append(ir.next()+"\n");
        }

        System.out.print(sb.toString());

    }

    static void solution(int m , String ss) {
        if(m == 0) {
            set.add(ss);
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(v[i] == false) {
                v[i] = true;
                solution(m - 1 , ss + arr[i] + " ");

                for(int j = i + 1; j <= N; j++) {
                    v[j] = false;
                }
            }
        }
    }
}
