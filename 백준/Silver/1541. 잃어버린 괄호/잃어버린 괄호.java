
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException, ScriptException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//
//        String arr[] = s.split("");
//
////        for(String k : arr) {
////            System.out.print(k);
////        }
//
//        ArrayList<String> arr2 = new ArrayList<>();
//        Stack<String> arr3 = new Stack<>();
//
//        if(!arr[0].equals("-")){
//            arr2.add("(");
//            arr3.push("(");
//        }
//
//        for(int i = 0; i < arr.length-1; i++) {
//
//            arr2.add(arr[i]);
//
//            if(arr[i].equals("-")) {
//                arr2.add("(");
//                arr3.push("(");
//            }else if(arr[i+1].equals("-")) {
//                arr2.add(")");
//                arr3.push(")");
//            }
//        }
//
//        arr2.add(arr[arr.length-1]);
//
//
//            if(arr3.peek().equals("(") ) {
//                arr2.add(")");
//            }
//
//        StringBuilder sb = new StringBuilder();
//        for(String z : arr2) {
//            //System.out.print(z);
//            sb.append(z);
//        }
//        //System.out.println();
//
//        ScriptEngineManager sem = new ScriptEngineManager();
//        ScriptEngine se = sem.getEngineByName("JavaScript");
//        System.out.println(se.eval(sb.toString()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s , "-");
        ArrayList<String> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }

        ArrayList<Integer> arrInt = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            int sum1 = 0;
            StringTokenizer st2 = new StringTokenizer(arr.get(i) , "+");
            while (st2.hasMoreTokens()) {
                sum1 = sum1 + Integer.parseInt(st2.nextToken());
            }
            arrInt.add(sum1);
        }

        int sum2 = arrInt.get(0);
        for(int i = 1; i < arrInt.size(); i++) {
            sum2 = sum2 - arrInt.get(i);
        }

        System.out.println(sum2);
    }
}
