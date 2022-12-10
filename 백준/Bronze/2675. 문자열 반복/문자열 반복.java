import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();

        for (int n = 0; n < Integer.parseInt(m); n++){

            String s = br.readLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            char ch;

            for(int i = 0; i < arr[1].length(); i++){

                ch = arr[1].charAt(i);

                for(int j = 0; j < a; j++){
                    bw.write(ch);
                }
            }
            bw.write("\n");

        }

        bw.flush();
        bw.close();




    }

}

