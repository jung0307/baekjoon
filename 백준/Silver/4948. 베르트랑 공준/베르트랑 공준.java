
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> arrInt = new ArrayList<>();
        int count = 0;
        int sum = 0;
//
//        while (true) {
//
//            String s = br.readLine();
//            int a = Integer.parseInt(s);
//            arrInt.add(a);
//            if(a == 0){
//                break;
//            }
//        }
////        for(Integer i : arrInt){
////            System.out.println("들어가 있음 " + i);
////        }
////        System.out.println("개수 "+arrInt.size());
//
//        for(int i = 0; i < arrInt.size()-1; i++) {
//            sum = 0;
//            for(int j = arrInt.get(i) +1; j <=2*arrInt.get(i); j++ ){
//
//                count = 0;
//
//                for(int k = 2; k <= j; k++){
//                    if(j%k == 0){
//                        count++;
//                    }
//                    if(count > 1){
//                        break;
//                    }
//                    if(k == j){
//                        if(count == 1){
//                            sum++;
//                        }
//                    }
//                }
//
//            }
//            System.out.println(sum);
//
//        }

        while (true) {

            String s = br.readLine();
            int a = Integer.parseInt(s);
            if(a==0){
                break;
            }

            sum = 0;
            for(int i = a+1; i <= 2*a; i++){
                count = 0;

                for(int j = 2; j <= Math.sqrt(i); j++) {

                    if(i%j == 0){
                        count++;
                        break;
                    }

                }
                if(count == 0){
                    sum++;
                }

            }
            System.out.println(sum);

        }
    }

}
//1
//        10
//        13
//        100
//        1000
//        10000
//        100000
//        0
//
//1
//        4
//        3
//        21
//        135
//        1033
//        8392