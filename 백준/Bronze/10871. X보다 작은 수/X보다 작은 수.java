import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String A = br.readLine();

        String arr1[] = s.split(" ");
        String N = arr1[0];
        String X = arr1[1];

        String arr2[] = A.split(" ");

        for(int i = 0; i < arr2.length; i++) {

            if(Integer.parseInt(X) > Integer.parseInt(arr2[i])) {
                bw.write(arr2[i]+" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
