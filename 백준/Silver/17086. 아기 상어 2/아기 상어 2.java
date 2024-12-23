import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
	static int N, M, S, P, K, A, B;
	static int answer = 0;
	static int[] arr;
	static int[] dx = {-1, -1,-1, 0,1,1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[][] matrix;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		matrix = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				answer = Math.max(answer, BFS(i, j));
			}
		}
		System.out.println(answer);
		
	}
	
	static int BFS(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {r, c, 0});
		boolean[][] visited = new boolean[50][50];
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			
			if(matrix[temp[0]][temp[1]] == 1) {
				return temp[2];
			}
			
			for(int dir = 0; dir < 8; dir++) {
				int nr = temp[0] + dx[dir];
				int nc = temp[1] + dy[dir];
				int ndist = temp[2] + 1;
				
				if(nr < 0 || nr >=N || nc < 0 || nc >= M) continue;
				if(visited[nr][nc] == true) continue;
				visited[nr][nc] = true;
				q.offer(new int[] {nr, nc, ndist});
			}
		}
		
		return -1;
	}
	
	
	
}