

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < n; i++) {
            int c = solution(Integer.parseInt(arr[0]) , Integer.parseInt(arr[i]));
            int d = Integer.parseInt(arr[0])/c;
            int e = Integer.parseInt(arr[i])/c;
            sb.append(d+"/"+e+"\n");
        }

        System.out.print(sb.toString());

    }

    static int solution(int a , int b) {

        int i = 2;
        int l = a >= b ? a : b;
        int s = a >= b ? b : a;
        int sum = 1;

        while (i <= l) {
            if(l%i == 0 && s%i == 0) {
                l = l/i;
                s = s/i;
                sum = sum * i;
                i = 2;
            }else{
                i++;
            }

        }

        return sum;

    }
}
