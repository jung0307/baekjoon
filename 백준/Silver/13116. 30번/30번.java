import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr[];
    static int depthArr[];

    static int parentArr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        arr = new ArrayList[1024];
        depthArr = new int[1024];
        parentArr = new int[1024];

        arr[1] = new ArrayList<>();
        arr[1].add(2);
        arr[1].add(3);

        parentArr[1] = 0;
        parentArr[2] = 1;
        parentArr[3] = 1;

        for(int i = 2; i < arr.length / 2; i++) {
            arr[i] = new ArrayList<>();
            arr[i].add(2 * i);
            arr[i].add((2 * i) + 1);

            parentArr[2 * i] = i;
            parentArr[(2 * i) + 1] = i;
        }

        depthMethod();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            sb.append(equalLevel(a , b) * 10 + "\n");
        }

        System.out.print(sb.toString());

    }

    static void depthMethod() {
        int cnt = 0;

        for(int i = 1; i < depthArr.length; i++) {
            if((int)Math.pow(2 , cnt) <= i && i < (int)Math.pow(2 , cnt + 1)) {
                depthArr[i] = cnt;
            }else {
                cnt++;

                if(i <= 1023) {
                    i--;
                }

            }
        }
    }

    static int equalLevel(int a , int b) {
        int aDepth = depthArr[a];
        int bDepth = depthArr[b];

        while (aDepth > bDepth) {
            aDepth = depthArr[parentArr[a]];
            a = parentArr[a];
        }

        while (bDepth > aDepth) {
            bDepth = depthArr[parentArr[b]];
            b = parentArr[b];
        }

        while (a != b) {
            a = parentArr[a];
            b = parentArr[b];
        }

        return a;
    }


}
