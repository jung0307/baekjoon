

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int sum = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
        System.out.println(sum);

    }

    public static void solution(int n) {

        if(n > 0) {
            sum = sum*n;
            solution(n-1);
        }

    }

}
