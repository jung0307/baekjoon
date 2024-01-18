import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr[];
    static int rangeS = 0;
    static int[] rangeE, newIdx;
    static long[] tree, lazy;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);

        newIdx = new int[N + 1];
        rangeE = new int[N + 1];

        StringBuilder sb = new StringBuilder();

        String s2[] = br.readLine().split(" ");
        arr = new ArrayList[N + 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i < s2.length; i++) {
            int n = Integer.parseInt(s2[i]);
            arr[n].add(i+1);
        }

        tree = new long[4 * N + 1];
        lazy = new long[4 * N + 1];

        assignRange(1);


        for(int i = 0; i < M; i++) {
            String s[] = br.readLine().split(" ");
            int node = Integer.parseInt(s[1]);

            if(s[0].equals("1")) {
                int ProfitLoss = Integer.parseInt(s[2]);

                update(1 , 1 , N , newIdx[node] , rangeE[node] , ProfitLoss);
            }else {
                sb.append(query(1 , 1 , N , newIdx[node]) + "\n");
            }

        }

        System.out.print(sb.toString());
    }

    static int assignRange(int index) {
        newIdx[index] = ++rangeS;
        rangeE[index] = rangeS;

        for(int i = 0; i < arr[index].size(); i++) {
            rangeE[index] = Math.max(rangeE[index], assignRange(arr[index].get(i)));
        }

        return rangeE[index];
    }

    static void propagate(int node , int start , int end) {
        if(lazy[node] != 0) {
            tree[node] = tree[node] + (end - start + 1) * lazy[node];;

            if(start < end) {
                lazy[2 * node] = lazy[2 * node] + lazy[node];
                lazy[2 * node + 1] = lazy[2 * node + 1] + lazy[node];
            }

            lazy[node] = 0;
        }

    }

    static void update(int node , int start , int end , int left , int right , int diff) {
        propagate(node , start , end);
        if(left <= start && end <= right) {
            lazy[node] = lazy[node] + diff;
            propagate(node , start , end);

        }else if(left <= end && start <= right){
            int mid = (start + end) / 2;
            update(node * 2 , start , mid , left , right , diff);
            update(node * 2 + 1, mid + 1 , end , left , right , diff);

        }
    }

    static long query(int node , int start , int end , int index) {
        propagate(node , start , end);
        if(start == end) {
            return tree[node];
        }else {
            int mid = (start + end) / 2;

            if(index <= mid) {
                return query(node * 2 , start , mid , index);
            }else {
                return query(node * 2 + 1 , mid + 1 , end , index);
            }
        }
    }


}