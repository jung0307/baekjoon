import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        String arr[] =b.split("");
        int sum = 0;
        for(int i = 0; i < a; i++) {
            sum = sum + Integer.parseInt(arr[i]);
        }

        bw.write(sum +"\n");
        bw.flush();
        bw.close();
        br.close();
        
    }


}

