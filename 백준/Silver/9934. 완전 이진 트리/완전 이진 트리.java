import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int arr[];
    static StringBuilder sb[];
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        n =  Integer.parseInt(br.readLine());
        sb = new StringBuilder[n];

        String s[] = br.readLine().split(" ");
        arr = new int[s.length];

        for(int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        for(int i = 0; i < n; i++) {
            sb[i] = new StringBuilder();
        }

        a(0 , arr.length - 1 , 0);

        for(int i = 0; i < n; i++) {
            System.out.println(sb[i].toString());
        }

    }

    public static void a(int l , int r , int k) {

        if(k == n) {
            return;
        }

        sb[k].append(arr[(l + r)/2] + " ");

        a(l , ((l + r)/2) - 1 , k + 1);
        a(((l + r)/2) + 1 , r , k + 1);
    }

}
