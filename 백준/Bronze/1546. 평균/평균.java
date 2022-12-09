import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        br.close();

            int arr2[] = new int[arr.length];
            int sum = 0;

            for(int i = 0; i < arr.length; i++){
                arr2[i] = Integer.parseInt(arr[i]);
                sum = sum + arr2[i];
            }

            int max = Arrays.stream(arr2).max().getAsInt();
            System.out.println( ((double)(sum*100)/(max*N)) );



    }
}
