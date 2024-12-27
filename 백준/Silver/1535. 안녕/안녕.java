import java.awt.Point;
import java.io.*;
import java.util.*;
 
public class Main {
 
    static int N;
    static int[] HealthArr, HappyArr;
	static int[][] dp;
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        N = Integer.parseInt(br.readLine());
		HealthArr = new int[N+1];
		HappyArr = new int[N+1];
		dp = new int[N+1][100];

		StringTokenizer Healthst = new StringTokenizer(br.readLine());
		StringTokenizer Happyst = new StringTokenizer(br.readLine());
		for (int i = 1; i < N+1; i++) {
			HealthArr[i] = Integer.parseInt(Healthst.nextToken());
			HappyArr[i] = Integer.parseInt(Happyst.nextToken());
        }

		for(int i=1;i<N+1;i++){
			for(int j=0;j<100;j++){
				if(j >= HealthArr[i]){
					dp[i][j] = Math.max(dp[i-1][j-HealthArr[i]]+HappyArr[i], dp[i-1][j]);
				}else{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[N][99]);
    }
}