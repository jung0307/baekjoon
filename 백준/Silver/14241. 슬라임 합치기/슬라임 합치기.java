import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");
        Deque<Integer> deque = new LinkedList<>();
        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        for(int i = n - 1; i >= 0; i--) {
            deque.add(arr[i]);
        }

        int a = deque.pollFirst();
        int b = deque.pollFirst();
        sum = a * b;
        deque.addFirst(a + b);

        while (deque.size() > 1) {
            a = deque.pollFirst();
            b = deque.pollFirst();
            sum = sum + (a * b);
            deque.addFirst(a + b);
        }

        System.out.println(sum);



    }
}
