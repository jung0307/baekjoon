import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int count = 0;
        int sum = 0;

//        for(count = 0; sum <= c-a; count++){
//            sum = sum + a - b;
//        }
//        if( sum - (a-b) < c-a ){
//            count++;
//        }

        count = (c - b) / (a - b);

        if( (c - b) % (a - b) != 0 ){
            count++;
        }

        bw.write((count)+"");

        bw.flush();
        bw.close();
        br.close();
    }

}
