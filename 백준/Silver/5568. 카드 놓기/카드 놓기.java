import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    static int N;
    static int K;
    static String arr[];
    static boolean v[];
    static Set<String> set;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        arr = new String[N + 1];
        set = new HashSet<>();
        v = new boolean[N + 1];
        int cnt = 0;

        for(int i = 1; i <= N; i++) {
            arr[i] = br.readLine();
        }

        solution(K , "");

        System.out.println(set.size());

    }

    static void solution(int k , String card) {
        if(k == 0) {
            set.add(card);
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(v[i] == false) {
                v[i] = true;
                solution(k - 1 , card + arr[i]);
                v[i] = false;
            }
        }
    }
}
