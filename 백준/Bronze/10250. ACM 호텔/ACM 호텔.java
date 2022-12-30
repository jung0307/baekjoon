
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int z = Integer.parseInt(br.readLine());
//
//        // 호수 구하기 N%H -> 호수로 N/H +1 층수로
//
//        for(int i = 0; i < z; i++){
//
//            String s = br.readLine();
//            String[] arr = s.split(" ");
//
//            int a = Integer.parseInt(arr[0]); // H 층수
//            int b = Integer.parseInt(arr[1]); // W 방수
//            int c = Integer.parseInt(arr[2]); // N N번째사람
//
//            int d = (int)(Math.ceil((double) c/a)); // 호수
//            int e = c%a; // 층수
//
//            String dd = "";
//
//
//
//            if(d < 10){
//                dd = "0"+d;
//            }
//            if(d == 0){
//                dd = Integer.toString(b);
//            }
//            if(e == 0){
//                e = a;
//            }
//
//            System.out.println("e :" + e);
//            System.out.println("dd :" + dd);
//            System.out.println(e+""+dd);
//
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            int h = Integer.parseInt(arr[0]);
            int w = Integer.parseInt(arr[1]);
            int m = Integer.parseInt(arr[2]);

            int rn = (int)Math.ceil((double)m/h );
            int ln = m%h;

           if(ln == 0) {
               ln = h;
           }

//             sb.append("h : "+h+"\n");
//             sb.append("w : "+w+"\n");
//             sb.append("m : "+m+"\n");
//             sb.append("rn : "+rn+"\n");
//             sb.append("ln : "+ln+"\n");

            if(rn < 10) {
                sb.append(ln+"0"+rn+"\n");
            }else{
                sb.append(ln+""+rn+"\n");
            }
        }

        System.out.print(sb.toString());


    }

}
