import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    Map<Integer, Set<Integer>> map = new HashMap<>();

    for (int i = 0; i < M; i++){
      st = new StringTokenizer(br.readLine());
      int key = Integer.parseInt(st.nextToken());
      int val = Integer.parseInt(st.nextToken());

      if (!map.containsKey(key)){
        map.put(key, new HashSet<>());
      }
      map.get(key).add(val);
    }

    int ans = 0;

    for (int i = 1; i <= N - 2; i++){
      for (int j = i + 1; j <= N - 1; j++){
        for (int k = j + 1; k <= N; k++){
          if (map.containsKey(i) && (map.get(i).contains(j) || map.get(i).contains(k))){
            continue;
          }

          if (map.containsKey(j) && (map.get(j).contains(i) || map.get(j).contains(k))){
            continue;
          }

          if (map.containsKey(k) && (map.get(k).contains(i) || map.get(k).contains(j))){
            continue;
          }

          ans++;
        }
      }
    }

    System.out.println(ans);
  }
}