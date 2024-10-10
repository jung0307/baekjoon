import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        boolean[] room = new boolean[N+1];

        while (M-- > 0) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            for (int i = x ; i < y; i++) {
                room[i] = true;
            }
        }

        int cnt = 0;

        for (int i = 1; i < N + 1; i++) {
            if(!room[i]) cnt += 1;
        }

        System.out.println(cnt);

    }
}