

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Stack {
//        push X: 정수 X를 스택에 넣는 연산이다.
//                pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        size: 스택에 들어있는 정수의 개수를 출력한다.
//                empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        int stack[];
        int ptr;

        public Stack() {
            stack = new int[10000];
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
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            String s = br.readLine();
            String arr[] = s.split(" ");
            int x = 0;

            if(arr[0].equals("push")) {
                //System.out.println(arr[0]);
                //System.out.println(arr[1]);
                x = Integer.parseInt(arr[1]);
            }
            //System.out.println("x : " + x);

            switch (arr[0]) {

                case "push" :
                    stack.push(x);
                    break;

                case "pop" :
                    sb.append(stack.pop()+"\n");
                    break;

                case "size" :
                    sb.append(stack.size()+"\n");
                    break;

                case "empty" :
                    sb.append(stack.empty()+"\n");
                    break;

                case "top" :
                    sb.append(stack.top()+"\n");
                    break;

            }

        }

        System.out.print(sb.toString());

    }


}
