import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        String A = br.readLine();

        String arr[] = A.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for(int i = 0; i < arr.length; i++) {

            if(max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
            if(min > Integer.parseInt(arr[i])) {
                min = Integer.parseInt(arr[i]);
            }
        }
        bw.write(Integer.toString(min) + " " + Integer.toString(max));
        bw.flush();
        bw.close();
        br.close();
    }

}
