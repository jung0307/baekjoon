import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

//        č	c=
//        ć	c-
//        dž	dz=
//        đ	d-
//        lj	lj
//        nj	nj
//        š	s=
//        ž	z=

        String a = "c=";
        String b = "c-";
        String c = "dz=";
        String d = "d-";
        String e = "lj";
        String f = "nj";
        String g = "s=";
        String h = "z=";

        int sizeOriginal = s.length();
        int size = sizeOriginal;
        String sa = s.replace(a , "0");
        int sizeA = sa.length();
        int countA = 0;

        for(int i = 0; i < sa.length(); i++){
            String[] arr = sa.split("");
            if(arr[i].equals("0")){
                countA = countA + 1;
            }
        }

        size =  size -countA;

        String sb = sa.replace(b , "1");

        int sizeB = sb.length();
        int countB = 0;

        for(int i = 0; i < sb.length(); i++){
            String[] arr = sb.split("");
            if(arr[i].equals("1")){
                countB = countB + 1;
            }
        }

        size =  size -countB;

        String sc = sb.replace(c , "2");

        int sizeC = sc.length();
        int countC = 0;

        for(int i = 0; i < sc.length(); i++){
            String[] arr = sc.split("");
            if(arr[i].equals("2")){
                countC = countC + 1;
            }
        }

        size =  size -countC*2;

        String sd = sc.replace(d , "3");

        int sizeD = sd.length();
        int countD = 0;

        for(int i = 0; i < sd.length(); i++){
            String[] arr = sd.split("");
            if(arr[i].equals("3")){
                countD = countD + 1;
            }
        }

        size =  size -countD;

        String se = sd.replace(e , "4");

        int sizeE = se.length();
        int countE = 0;

        for(int i = 0; i < se.length(); i++){
            String[] arr = se.split("");
            if(arr[i].equals("4")){
                countE = countE + 1;
            }
        }

        size =  size -countE;

        String sf = se.replace(f ,"5");

        int sizeF = sf.length();
        int countF = 0;

        for(int i = 0; i < sf.length(); i++){
            String[] arr = sf.split("");
            if(arr[i].equals("5")){
                countF = countF + 1;
            }
        }

        size =  size -countF;

        String sg = se.replace(g ,"6");

        int sizeG = sg.length();
        int countG = 0;

        for(int i = 0; i < sg.length(); i++){
            String[] arr = sg.split("");
            if(arr[i].equals("6")){
                countG = countG + 1;
            }
        }

        size =  size -countG;

        String sh = se.replace(h ,"7");

        int sizeH = sh.length();
        int countH = 0;

        for(int i = 0; i < sh.length(); i++){
            String[] arr = sh.split("");
            if(arr[i].equals("7")){
                countH = countH + 1;
            }
        }

        size =  size -countH;

//        System.out.println("sizeOriginal : " + sizeOriginal);
//        System.out.println("countA : " + countA);
//        System.out.println("countB : " + countB);
//        System.out.println("countC: " + countC);
//        System.out.println("countD : " + countD);
//        System.out.println("countE : " + countE);
//        System.out.println("countF : " + countF);
//        System.out.println("countG : " + countG);
//        System.out.println("countH : " + countH);

        int answer = size;
        System.out.println(answer);
    }

}
