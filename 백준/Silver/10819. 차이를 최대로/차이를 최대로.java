import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int arr[];
    static int arr2[];
    static boolean v[];
    static int N;
    static int max = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        arr2 = new int[N];
        v = new boolean[N];
        String s[] = br.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        solution(N , 0);

        System.out.println(max);

    }

    static void solution(int depth, int index) {
        if(depth == 0) {
            index = 0;
            solutionMax();
            return;
        }

        for(int i = 0; i < N; i++) {
            if(v[i] == false) {
                v[i] = true;
                arr2[index] = arr[i];
                solution(depth - 1  , + index + 1);
                v[i] = false;
            }
        }
    }

    static void solutionMax() {
        int sum = 0;
        for(int i = 0; i < N - 1; i++) {
            sum = sum + (int)Math.abs(arr2[i] - arr2[i + 1]);
        }
        if(sum >= max) {
            max = sum;
        }

    }
}
