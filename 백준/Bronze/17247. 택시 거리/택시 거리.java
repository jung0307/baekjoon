import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        boolean tf1 = false;
        boolean tf2 = false;

        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);

        for(int i = 0; i < N; i++) {
            String s2[] = br.readLine().split(" ");

            for(int j = 0; j < M; j++) {
                if(s2[j].equals("1")) {
                    if(tf1 == false) {
                        x1 = j;
                        y1 = i;
                        tf1 = true;
                    } else if (tf1 == true) {
                        x2 = j;
                        y2 = i;
                        tf2 = true;
                        break;
                    }
                }
            }
        }
        
        System.out.println((int)(Math.abs(x1 - x2) + Math.abs(y1 - y2)));

    }
}
