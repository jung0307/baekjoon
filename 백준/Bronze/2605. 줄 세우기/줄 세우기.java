import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> arr = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        arr.add(1);

        for(int i = 1; i < s.length; i++) {
            int a = Integer.parseInt(s[i]);

            arr.add(i - a , i + 1);
        }

        for(int i = 0; i < arr.size() - 1; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println(arr.get(arr.size() - 1));

    }
}
