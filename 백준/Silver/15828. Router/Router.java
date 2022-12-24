
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<Integer>();
        int a;
        while (  (a = Integer.parseInt(br.readLine())) != -1 ) {

            if(queue.size() < n && a != 0) {
                queue.add(a);
            }
            if(a == 0){
                queue.poll();
            }

        }

        if(queue.size() == 0){
            System.out.println("empty");
        }else{
            while (queue.size() > 0) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }
    }
}
