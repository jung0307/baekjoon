

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        7
//        4 50
//        2 160
//        3 30
//        1 60
//        3 20
//        1 100

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arrInt = new int[6][2];
        int[] arrInt2 = new int[5];

        Map<Integer , Integer> map = new HashMap();

        for(int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            arrInt[i][0] = Integer.parseInt(st.nextToken());
            arrInt[i][1] = Integer.parseInt(st.nextToken());

            arrInt2[arrInt[i][0]] = arrInt2[arrInt[i][0]] + 1;
            map.put(arrInt[i][0] , arrInt[i][1]);
        }

//        for(int[] x :  arrInt){
//            for(int c : x){
//                System.out.print(c+" ");
//            }
//            System.out.println();
//        }
//
//        for(int a : arrInt2){
//            System.out.println(a);
//        }

        int ew = arrInt2[1] > arrInt2[2] ? 1 : 2;
        int sn = arrInt2[3] > arrInt2[4] ? 3 : 4;

        int q =  arrInt2[1] > arrInt2[2] ? 2 : 1;
        int w =  arrInt2[3] > arrInt2[4] ? 4 : 3;

        int qw = (map.get(q) * map.get(w));

//        System.out.println("ew : "+ew);
//        System.out.println("sn : "+sn);
//        System.out.println("q : "+q);
//        System.out.println("w : "+w);
//        System.out.println("qw : "+qw);

        boolean tf1 = false;
        boolean tf2 = false;
        boolean tf3 = false;
        boolean tf4 = false;

        for(int j = 0; j < arrInt.length-1; j++) {
            if((arrInt[j][0] == ew && arrInt[j+1][0] == w) ) {

                if(j>0){
                    //System.out.println("a :"+j);
//                    System.out.println("a :"+(arrInt[j-1][1]));
//                    System.out.println("a :"+(map.get(q) - arrInt[j][1]));
//                    System.out.println("a :"+map.get(q));
//                    System.out.println("a :"+arrInt[j][1]);
                    System.out.println(n * (qw - ((arrInt[j-1][1]) * (map.get(q) - arrInt[j][1]) ) ));
                    tf1 = true;
                    break;
                }else if(j == 0){
                    //System.out.println("b"+j);
                    System.out.println(n * (qw - ((arrInt[5][1]) * (map.get(q) - arrInt[0][1]) ) ));
                    tf1 = true;
                    break;
                }
                //System.out.println("c"+j);

            }
            else if((arrInt[j][0] == sn && arrInt[j+1][0] == q)){

                if(j>0){
                    //System.out.println("d"+j);
                    System.out.println(n * (qw - (arrInt[j-1][1] * (map.get(w) - arrInt[j][1]) ) ));
                    tf2 = true;
                    break;
                }else if(j == 0){
                    //System.out.println("e"+j);
                    System.out.println(n * (qw - (arrInt[5][1] * (map.get(w) - arrInt[0][1]) ) ));
                    tf2 = true;
                    break;
                }
                //System.out.println("f"+j);
            }else if((arrInt[j][0] == w && arrInt[j+1][0] == q) && !(arrInt[j][0] == ew && arrInt[j+1][0] == w) ) {
                //System.out.println("g"+j);
                tf3 = true;
            }else if((arrInt[j][0] == q && arrInt[j+1][0] == w) && !(arrInt[j][0] == sn && arrInt[j+1][0] == q)) {
                //System.out.println("h"+j);
                tf4 = true;
            }

        }

        if(tf3 == true || tf4 == true) {
            //System.out.println("?");
           System.out.println(n * (qw - (arrInt[3][1] * arrInt[4][1])));
        }
    }
}
