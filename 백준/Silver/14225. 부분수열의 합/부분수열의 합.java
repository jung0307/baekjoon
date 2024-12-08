import java.util.*;

class Main{
    static int n;
    static int[] arr;
    static boolean[] visited = new boolean[20*100000 + 10];
    static int answer = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        dfs(0,0);
        while(visited[answer]){
            answer++;
        }
        System.out.println(answer);
    }

    static void dfs(int idx,int sum){
        if(idx == n){
            visited[sum] = true;
        }
        else{
            dfs(idx+1,sum+arr[idx]);
            dfs(idx+1,sum);
        }
    }

}