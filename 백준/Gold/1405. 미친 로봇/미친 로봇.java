import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
    static int[] rangeX = { 0, 0, 1, -1 };
    static int[] rangeY = { 1, -1, 0, 0 };
    static int N;
    static double[] percentages;
    static double ans = 0;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        N = Integer.parseInt(st.nextToken());
        percentages = new double[4]; 
        for (int i = 0; i < 4; i++) {
            percentages[i] = Double.parseDouble(st.nextToken()) * 0.01;
        }
 
        boolean[][] visited = new boolean[30][30];
        visited[15][15] = true;
        DFS(15, 15, visited, 0, 1);
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static void DFS(int x, int y, boolean[][] visited, int cnt, double result) {
        if (cnt == N) { 
            ans += result; 
            return;
        }
 
        for (int i = 0; i < 4; i++) {
            int dx = x + rangeX[i];
            int dy = y + rangeY[i];
 
            if (dx <= 0 || dy <= 0 || dx >= 30 || dy >= 30) {
                continue;
            }
 
            if (!visited[dx][dy]) {
                visited[dx][dy] = true;
                DFS(dx, dy, visited, cnt + 1, result * percentages[i]);
                visited[dx][dy] = false;
            }
        }
    }
 
}