
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt[] = new int[n];
        int arrInt2[] = new int[n];
        boolean tf = false;

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
            arrInt2[i] = arrInt[i];
        }

        Arrays.sort(arrInt2);

        Stack<Integer> stack = new Stack<>();

        int a = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arrInt[0]; i++) {
            if(arrInt2[i] <= arrInt[0]) {
                stack.push(arrInt2[i]);
                a = i;
                sb.append("+\n");

            }
        }

        int b = 0;

        while (b != arrInt.length) {

                if(stack.isEmpty()) {
                    if(a+1 == arrInt2.length) {
                        break;
                    }else {
                        stack.push(arrInt2[++a]);
                        sb.append("+\n");
                    }
                }else {
                    if(arrInt[b] == stack.peek()) {
                        stack.pop();
                        sb.append("-\n");
                        b++;
                    }else if(arrInt[b] > stack.peek()) {
                        stack.push(arrInt2[++a]);
                        sb.append("+\n");
                    }else {
                       break;
                    }
                }

        }

        if(b != arrInt.length) {
            tf = true;
        }

        if(tf == false) {
            System.out.print(sb.toString());
        }else {
            System.out.println("NO");
        }
    }
}
