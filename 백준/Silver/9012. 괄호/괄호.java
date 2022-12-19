

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Stack<String> stack = new Stack<>();
        //ArrayList<String> stack = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < n; i++) {

            int a = 0;
            int b = 0;
            int c = 0;
            boolean tf = false;

            String w = br.readLine();
            String[] arr = w.split("");

//            st = new StringTokenizer(br.readLine() , "");
//            while (st.hasMoreTokens()) {
//               // stack.push(st.nextToken());
//                System.out.println("?");
//                stack.add(st.nextToken());
//            }

            boolean aa = false;
            stack.clear();

            for (String r : arr){

                if(r.equals("(")) {
                    stack.push(r);
                }else{
                    try {
                        stack.pop();
                    }catch (Exception e){
                        System.out.println("NO");
                        aa = true;
                        break;
                    }
                }

            }

            if(aa == false) {
                if(stack.size() > 0) {
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }




           // System.out.println(stack.size());

//            for(int j = stack.size()-1; j > 0; j--) {
//            //    System.out.println("test");
//                if(stack.get(j).equals(")")) {
//                   // System.out.println("a");
//                    a++;
//                }else{
//                   // System.out.println("b");
//                    b++;
//                }
//
//                if(j == 1) {
//                    System.out.println("if(j == stack.size() -1) " + c);
//                    if(stack.get(j).equals(")")) {
//                     //   System.out.println("a");
//                        a++;
//                    }else{
//                       // System.out.println("b");
//                        b++;
//                    }
//                }
//
//                if( !(stack.get(j).equals(stack.get(j-1))) || j == 1) {
//                    c++;
//                 //   System.out.println("c : " + c);
//                 //   System.out.println("--------");
//
//                    if(c%2 == 0 && c != 0) {
//                    //    System.out.println("ㅅㅂ");
//                    //    System.out.println("a : " + a);
//                    //    System.out.println("b : " + b);
//                        if(a != b){
//                        //    System.out.println("true");
//                            tf = true;
//                            break;
//                        }
//                    }
//
//                }
//
//            }

//            if(tf == false && c != 0){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
////            System.out.println("a : " + a);
////            System.out.println("b : " + b);
////            System.out.println("j=0 : " + stack.get(0));
        }
//        for (String e : stack) {
//            System.out.println(e);
//        }
    }


}


//6
//        (())())
//        (((()())()
//        (()())((()))
//        ((()()(()))(((())))()
//        ()()()()(()()())()
//        (()((())()(

//3
//        ((
//        ))
//        ())(()