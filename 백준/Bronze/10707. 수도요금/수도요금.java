import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine()); // B의 기본요금
        int C = Integer.parseInt(br.readLine()); // B의 기본요금 상한
        int D = Integer.parseInt(br.readLine()); // B의 추가요금
        int P = Integer.parseInt(br.readLine());

        int X = A * P;
        int Y = 0;

        if(P > C) {
            Y = B + (P - C) * D;
        }else {
            Y = B;
        }

        if(X >= Y) {
            System.out.println(Y);
        }else {
            System.out.println(X);
        }

    }
}
