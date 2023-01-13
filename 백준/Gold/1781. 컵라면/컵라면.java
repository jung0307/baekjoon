

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arrInt = new int[n][2];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            arrInt[i][0] = Integer.parseInt(s[0]);
            arrInt[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(arrInt, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });

        int cupSum = 0;

        Queue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < arrInt.length; i++) {
            
            //System.out.println(arrInt[i][0] + " " + arrInt[i][1]);
            
            if(queue.size() < arrInt[i][0]) {
                queue.add(arrInt[i][1]);
            }else if(queue.size() == arrInt[i][0]) {
                if(queue.peek() < arrInt[i][1]) {
                    //System.out.println(queue.peek() + "  ");
                    queue.poll();
                    queue.add(arrInt[i][1]);
                }
            }

        }

        for(int c : queue) {
            cupSum = cupSum + c;
        }

        System.out.println(cupSum);

    }
}
