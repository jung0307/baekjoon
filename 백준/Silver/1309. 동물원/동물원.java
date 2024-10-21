import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		final int MOD = 9901;
		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[N + 1][3];
		dp[1][0] = dp[1][1] = dp[1][2] = 1; 

		for (int i = 2; i <= N; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
		}

		long ans = (dp[N][0] + dp[N][1] + dp[N][2]) % MOD;
		bw.write(ans + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}