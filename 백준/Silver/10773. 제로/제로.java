

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Stack {

        int stack[];
        int ptr;

        public Stack() {
            stack = new int[100000];
            ptr = 0;
        }

        public void push(int x) {
            stack[ptr++] = x;
        }

        public int pop() {
            if(ptr <= 0) {
                return -1;
            }
            return stack[--ptr];
        }

        public int size() {
            return ptr;
        }

        public int empty() {
            if(ptr <= 0) {
                return 1;
            }else {
                return 0;
            }
        }

        public int top() {
            if(ptr <= 0) {
                return -1;
            }else{
                return stack[ptr - 1];
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for(int i = 0; i < n; i++) {

            int m = Integer.parseInt(br.readLine());

            if(m == 0) {
                stack.pop();
            }else{
                stack.push(m);
            }

        }

        int sum = 0;

        while (stack.size() > 0){
            sum = sum + stack.pop();
        }

        System.out.print(sum);

    }


}
