import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s);

        int a = 0;
        int b = 0;

        while(true){
            a++;

            if(n <= 5*a){
                break;
            }
        }
        boolean tr = false;

        int aa = a;

        for(int i = 0; i < a+1; i++){

            if( (n - 5*aa)%3 == 0 && (n - 5*aa) >= 0){
                tr = true;
                b= (n-5*aa)/3;
                break;
            }
            aa--;

        }

//        System.out.println(a);
//        System.out.println(aa);
//        System.out.println(b);
        if(tr == false){
            System.out.println("-1");
        }else{
            System.out.println(aa+b);
        }

    }

}

