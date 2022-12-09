import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        int arr[] = {a,b,c,d,e,f,g,h,i};
        int temp = 0;
        int count = 0;

        for(int j = 0; j < arr.length; j++){
            if(temp < arr[j]){
                temp = arr[j];
                count = j+1;
            }
        }

        System.out.println(temp);
        System.out.println(count);
    }

}
