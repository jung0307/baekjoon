
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        RDD
//        4
//        [1,2,3,4]

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < n; i++) {
            String a[] = br.readLine().split("");
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine() , "[,]");
            LinkedList<Integer> arrInt = new LinkedList<>();


            while (st.hasMoreTokens()) {
                arrInt.add(Integer.parseInt(st.nextToken()));
            }

            boolean tf = false;
            boolean tf2 = false;

            int c = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[j].equals("D")) {
                    c++;

                    if(c > b) {
                        sb.append("error\n");
                        tf2 = true;
                        break;
                    }

                    if(tf == false) {
                        arrInt.pollFirst();
                    }else {
                        arrInt.pollLast();
                    }
                }else {
                    if(tf == false) {
                        tf = true;
                    }else {
                        tf = false;
                    }
                }


            }

            if(tf2 == false) {
                if(tf == false ) {
                    String aaaa = "";

                    if(arrInt.size() == 0) {
                        sb.append("[]\n");
                    }else {
//                        while (arrInt.size() > 1) {
//                            aaaa = aaaa + arrInt.pollFirst() + ",";
//                        }
//                        aaaa = aaaa + arrInt.pollFirst();
//                        sb.append("["+aaaa+"]\n");

                        sb.append("[");
                        sb.append(arrInt.pollFirst());
                        while (!(arrInt.isEmpty())) {
                            sb.append(","+arrInt.pollFirst());
                        }
                        sb.append("]\n");

//                        sb.append(arrInt.toString()+"\n");
                    }

                }else {

                    String aaaa = "";

                    if(arrInt.size() == 0) {
                        sb.append("[]\n");
                    }else {
//                        while (arrInt.size() > 1) {
//                            aaaa = aaaa + arrInt.pollLast() + ",";
//                        }
//                        aaaa = aaaa + arrInt.pollLast();
//                        sb.append("["+aaaa+"]\n");

                        sb.append("[");
                        sb.append(arrInt.pollLast());
                        while (!(arrInt.isEmpty())) {
                            sb.append(","+arrInt.pollLast());
                        }
                        sb.append("]\n");

//                        Collections.reverse(arrInt);
//                        sb.append(arrInt.toString()+"\n");
                    }
                }
            }

        }

        System.out.print(sb.toString());
    }
}
