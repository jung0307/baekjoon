
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int r1 = 0;
        int r2 = 0;

        StringTokenizer st;

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine() , " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            int a = (int)((Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2))) ;

//            System.out.println("x1 : " +x1);
//            System.out.println("y1 : " +y1);
//            System.out.println("r1 : " +r1);
//            System.out.println("x2 : " +x2);
//            System.out.println("y2 : " +y2);
//            System.out.println("r2 : " +r2);
//            System.out.println("a : " +a);
//            System.out.println("b : " +b);

            if(a == 0 && r1 == r2) {
                System.out.println("-1");
            }else if(a > Math.pow(r1 + r2, 2)) {
                System.out.println("0");
            }else if(a < Math.pow(r2 - r1, 2)) {
                System.out.println("0");
            }else if(a == Math.pow(r2 - r1, 2)) {
                System.out.println("1");
            }else if(a == Math.pow(r1 + r2, 2)) {
                System.out.println("1");
            }else {
                System.out.println("2");
            }

        }


    }
}
