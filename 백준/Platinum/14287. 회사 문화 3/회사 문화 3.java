import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr[];
    static int[] in;
    static int[] out;
    static int[] tree;
    static int count = 0;
    static int n;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();

        arr = new ArrayList[n + 1];
        in = new int[n + 1];
        out = new int[n + 1];
        tree = new int[n + 1];

        String s2[] = br.readLine().split(" ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i < s2.length; i++) {
            arr[Integer.parseInt(s2[i])].add(i + 1);
        }

        dfs(1);

//        for(int i = 1; i < Child.length; i++) {
//            for(int j = 0; j < Child[i].size(); j++) {
//                System.out.print(i + " " + Child[i].get(j) + " ");
//            }
//            System.out.println();
//        }


        for(int i = 0; i < m; i++) {
            String s3[] = br.readLine().split(" ");

            int a = Integer.parseInt(s3[0]);
            int b = Integer.parseInt(s3[1]);

            if(a == 1) {
                int c = Integer.parseInt(s3[2]);

                update(in[b] , c);
            }else {
                sb.append( ( sumCompliment(out[b]) - sumCompliment(in[b] - 1) )+ "\n");
            }
        }

        System.out.print(sb.toString());

    }

    static void dfs(int node) {
        in[node] = ++count;
        for(int child : arr[node]) {
            dfs(child);
        }
        out[node] = count;
    }

    static int sumCompliment(int index) {
        int sum = 0;
        while (index > 0) {
            sum = sum + tree[index];
            index = index - (index& - index);
        }
        return sum;
    }

    static void update(int index , int w) {
        while (index <= n) {
            tree[index] = tree[index] + w;
            index = index + (index& - index);
        }
    }
}
