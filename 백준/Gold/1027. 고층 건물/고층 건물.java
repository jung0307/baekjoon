import java.io.*;
import java.util.*;

class Main {
  static int N;
  static int[] arr;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; ++i) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int ans = 0;
    for(int b=0; b<N; ++b) { 
      double slope = 1000000001.0; 
      int cnt = 0;
      for(int i=b-1; i>=0; --i) { 
        double cur_slope = calculateSlope(b, i, arr[b], arr[i]);
        if(cur_slope >= slope) {
          continue;
        }
        cnt++;
        slope = cur_slope;
      }

      slope = -1000000001.0; 
      for(int i=b+1; i<N; ++i) {
        double cur_slope = calculateSlope(b, i, arr[b], arr[i]);
        if(cur_slope <= slope) {
          continue;
        }
        cnt++;
        slope = cur_slope;

      }

      ans = Math.max(ans, cnt);
    }

    System.out.println(ans);
  }

  private static double calculateSlope(int x1, int x2, int y1, int y2) {
    return ((double)y2 - (double)y1) / ((double)x2 - (double)x1);
  }
}