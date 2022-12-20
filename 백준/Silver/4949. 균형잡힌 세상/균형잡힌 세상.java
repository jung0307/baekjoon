

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ( !(s = br.readLine()).equals(".") ) {

            String arr[] = s.split("");
            Stack<String> stack1 = new Stack<>();
            //Stack<String> stack2 = new Stack<>();
            Boolean tf1 = false;
            Boolean tf2 = false;

            for(int i = 0; i < arr.length; i++){
                String a = arr[i];
//            System.out.println(a);
//            System.out.println(i);
                if(a.equals("(")){

                    stack1.push(a);

                }else if(a.equals("[")){

                    //stack2.push(a);
                    stack1.push(a);

                }else if(a.equals(")")){

                    try {
                        if(stack1.peek().equals("[")){
                            //System.out.println("no");
                            tf1 = true;
                        }else
                            stack1.pop();

                    }catch (Exception e){
                        //System.out.println("no");
                        tf1 = true;
                    }

                }else if(a.equals("]")){

                    try {
                        if(stack1.peek().equals("(")){
                            //System.out.println("no");
                            tf2 = true;
                        }else
                            //stack2.pop();
                            stack1.pop();

                    }catch (Exception e){
                        //System.out.println("no");
                        tf2 = true;
                    }

                }
            }

            if(tf1 == false && tf2 == false && stack1.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

//            for(String q : stack1){
//                System.out.println(q);
//            }
//        for(String q : stack2){
//            System.out.println(q);
//        }
        }

    }
}
//    So when I die (the [first] I will see in (heaven) is a score list).
//        [ first in ] ( first out ).
//        Half Moon tonight (At least it is better than no Moon at all].
//        A rope may form )( a trail in a maze.
//        Help( I[m being held prisoner in a fortune cookie factory)].
//        ([ (([( [ ] ) ( ) (( ))] )) ]).
//        .
//        .