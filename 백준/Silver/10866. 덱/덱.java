
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = 0;

            if(s[0].equals("push_front") || s[0].equals("push_back")) {
                a = Integer.parseInt(s[1]);
            }

            switch (s[0]) {
                case "push_front" :
                    queue.addFirst(a);
                    break;
                case "push_back" :
                    queue.addLast(a);
                    break;
                case "pop_front" :
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        sb.append(queue.pollFirst()+"\n");
                    }
                    break;
                case "pop_back" :
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        sb.append(queue.pollLast()+"\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size()+"\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        sb.append(queue.peekFirst()+"\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        sb.append(queue.peekLast()+"\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());

    }
}
