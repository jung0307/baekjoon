import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int N, K, map[][], round[][], win[];
	static boolean visit[], flag;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		flag = false;
		win = new int[4];
		visit = new boolean[N + 1];
		round = new int[4][21];
		for (int i = 2; i <= 3; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 1; j <= 20; j++) {
				round[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		perm(1);
		if (flag)
			System.out.println(1);
		else
			System.out.println(0);
	}

	static void perm(int dep) {
		if (flag) {
			return;
		}
		if (dep == N + 1) {
			game();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				round[1][dep] = i;
				perm(dep + 1);
				visit[i] = false;
			}
		}
	}

	static void game() {
		int index[] = new int[4];
		for(int i=1; i<=3; i++)
			index[i]=1;
		int p1 = 1;
		int p2 = 2;
		int np = 3;
		int win[] = new int[4];
		while (true) {
			np = 6 - (p1 + p2);
			if (win[1] == K) {
				flag = true;
				return;
			}
			if (win[2] == K || win[3] == K) {
				return;
			}
			if (index[1] == N + 1) {
				return;
			}
			if (index[2] == 21 || index[3]==21) {
				return;
			}

			int cmd1 = round[p1][index[p1]];
			int cmd2 = round[p2][index[p2]];
			int winner = winCheck(cmd1, cmd2, p1, p2);
			win[winner]++;
			index[p1]++;
			index[p2]++;
			p1 = winner;
			p2 = np;

		}
	}

	static int winCheck(int cmd1, int cmd2, int p1, int p2) {
		if (map[cmd1][cmd2] == 2) {
			return p1;
		} else if (map[cmd1][cmd2] == 1) {
			return Math.max(p1, p2);
		} else {
			return p2;
		}
	}
}
