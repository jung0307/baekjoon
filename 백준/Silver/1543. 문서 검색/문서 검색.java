
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        String v = br.readLine();
        String s1[] = w.split("");
        String s2[] = v.split("");

        int i = 0;
        int j = 0;
        int count = 0;

       if(w.equals(v)){
           count = 1;
       }else{
           while (i <= s1.length - 1) {

               boolean tf = false;
               int count2 = 0;

               for(int a = 0; a < s2.length; a++) {
                     //System.out.println("i : " + i);
                     //System.out.println("a : " + a);
//                   System.out.println("count2 : " + count2);

                   if(i == s1.length){
                       break;
                   }else
                   {

                       //System.out.println(count2 + " count2");

                        if(i+a <= s1.length - 1){
                            count2++;
                            if(s2[a].equals(s1[a+i])) {
                                tf = true;
                                //i++;
                                //System.out.println(i);
                            }else{
                                count2++;
                                tf = false;
                                i++;
                                //System.out.println("br "+i);
                                break;
                            }
                        }else{
                            i = i + a;
                            break;
                        }

                   }

               }

               if(tf == true && count2 == s2.length) {
                   i = i + s2.length;
                   count++;
               }

           }

       }

        System.out.println(count);
    }
}
