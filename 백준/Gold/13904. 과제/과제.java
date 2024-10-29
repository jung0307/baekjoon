import java.io.*;
import java.util.*;

public class Main {

    static class Score {

        int d, w;

        Score(int d, int w) {
            this.d = d;
            this.w = w;
        }
    }

    static int n, d, w, maxDay, res;
    static List<Score> scores;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        maxDay = Integer.MIN_VALUE;

        scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            scores.add(new Score(d, w));
            maxDay = Math.max(maxDay, d);
        }

        maxScore();

        System.out.println(res);

        br.close();
    }

    private static void maxScore() {

        for (int i = maxDay; i >= 1; i--) {
            Score ans = new Score(0, 0);

            for (Score score : scores) {
                if (score.d >= i) {
                    if (ans.w < score.w) {
                        ans = score;
                    }
                }
            }

            res += ans.w;
            scores.remove(ans);
        }
    }
}