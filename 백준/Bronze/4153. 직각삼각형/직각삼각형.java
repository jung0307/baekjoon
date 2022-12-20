

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Integer[] arrInt = new Integer[3];

        StringTokenizer st;

        while ( !(s = br.readLine()).equals("0 0 0") ) {

            st = new StringTokenizer(s , " ");
            arrInt[0] = Integer.parseInt(st.nextToken());
            arrInt[1] = Integer.parseInt(st.nextToken());
            arrInt[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arrInt , Collections.reverseOrder());

//            for(int a : arrInt){
//                System.out.println(a);
//            }

            if( Math.pow(arrInt[0] ,2) == Math.pow(arrInt[1] ,2) + Math.pow(arrInt[2] ,2) ) {
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }

}
