import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().replace(" " , "0");
        String[] arr = s.split("");
        ArrayList<Integer> arrInt = new ArrayList<>();
 //       System.out.println(s);
 //       System.out.println("길이 " + arr.length);
        for(int i = 0; i < arr.length; i++) {

            if(arr[i].equals("0")){
                arrInt.add(i);
            }

        }

//       for(Integer i : arrInt) {
//           bw.write(i+" ");
//       }
       try{
           int count = arrInt.size();
    //      bw.write("\n"+"arr.length = " +arr.length);
   //        bw.write("\n"+"arrInt.size() = " +arrInt.size());
           if(arrInt.get(0) == 0){
               count--;
           }
           if(arrInt.get(arrInt.size()-1) == (arr.length-1)){
               count--;
           }
           bw.write((count+1)+"");

       }catch (Exception e){
           bw.write("1");
       }finally {
           bw.flush();
           bw.close();
           br.close();
       }

    }

}
