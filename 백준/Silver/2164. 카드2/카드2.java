

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

//        while (queue.size() > 0) {
//            System.out.println(queue.poll());
//        }


        int j = 1;
        while (queue.size() > 0) {

            if(queue.size() == 1){
                System.out.println(queue.poll());
                break;
            }else{
                if(j%2 != 0) {
                    queue.poll();
                }else{
                    queue.add(queue.poll());
                }
            }
            j++;
        }

    }
}
