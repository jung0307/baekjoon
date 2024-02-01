import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int a;
    static int b;
    static int arr[];
    static boolean v[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);

        arr = new int[a + 1];
        v = new boolean[a + 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        solution(b , "");

    }

    static void solution(int b , String s) {

        if(b == 0) {
            System.out.println(s);
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            if(v[i] == false) {
                v[i] = true;
                solution(b - 1, s + arr[i] +" ");
                v[i] = false;
            }
        }
    }
}
