import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int arrWolf[] = new int[4];
        ArrayList<String> strWolf = new ArrayList<>();
        String wolf = "";

        boolean tf = false;

        if(s.length % 4 == 0) {
            for(int i = 0; i < s.length - 1; i++) {
                if(s[i].equals("f") && !s[i + 1].equals("f")) {
                    wolf = wolf + "f";
                    strWolf.add(wolf);
                    wolf = "";
                }
                else if (s[i + 1].equals("f") && i + 1 == s.length - 1) {
                    wolf = wolf + s[i] + "f";
                    strWolf.add(wolf);
                    wolf = "";
                }
                else {
                    wolf = wolf + s[i];
                }
            }

            int strWolfSum = 0;

            for(String a : strWolf) {
                strWolfSum = strWolfSum + a.length();
            }

            if(strWolf.size() == 0 || strWolfSum != s.length) {
                tf = true;
            }

            for(int i = 0; i < strWolf.size(); i++) {
                if(strWolf.get(i).length() % 4 != 0) {
                    tf = true;
                    break;
                }
            }

            if(tf == true) {
                System.out.println("0");
            }else {

                for(int i = 0; i < strWolf.size(); i++) {

                    String ss[] = strWolf.get(i).split("");
                    int n = 0;

                    for(int j = 0; j < ss.length - 1; j++) {
                        if(!ss[j].equals("w")) {
                            break;
                        }else {
                            if(ss[j].equals("w")) {
                                n++;
                            }
                        }
                    }

                    if(n == 0 || n * 4 != ss.length) {
                        tf = true;
                        break;
                    }

                    for(int j = 0; j < n; j++) {
                        if(!ss[j].equals("w")) {
                            tf = true;
                            break;
                        }
                    }
                    for(int j = n; j < 2*n; j++) {
                        if(j < ss.length) {
                            if(!ss[j].equals("o")) {
                                tf = true;
                                break;
                            }
                        }
                    }
                    for(int j = 2*n; j < 3*n; j++) {
                        if(j < ss.length) {
                            if(!ss[j].equals("l")) {
                                tf = true;
                                break;
                            }
                        }
                    }
                    for(int j = 3*n; j < 4*n; j++) {
                        if(j < ss.length) {
                            if(!ss[j].equals("f")) {
                                tf = true;
                                break;
                            }
                        }
                    }

                    if(tf == true) {
                        break;
                    }

                }

                if(tf == false) {
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }

            }

        }else {
            System.out.println("0");
        }

    }
}
