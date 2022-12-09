import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int x = 0;
        int o = 1;
        int sum = 0;

        for(int i = 0; i < N; i++){
            String[] arr = br.readLine().split("");
            sum = 0;
            o = 1;
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals("O")){
                    sum = sum + o;
                    o++;
                }else{
                    o = 1;
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
