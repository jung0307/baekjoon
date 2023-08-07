import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

//        1995: ITMO
//        1996: SPbSU
//        1997: SPbSU
//        1998: ITMO
//        1999: ITMO
//        2000: SPbSU
//        2001: ITMO
//        2002: ITMO
//        2003: ITMO
//        2004: ITMO
//        2005: ITMO
//        2006: PetrSU, ITMO
//        2007: SPbSU
//        2008: SPbSU
//        2009: ITMO
//        2010: ITMO
//        2011: ITMO
//        2012: ITMO
//        2013: SPbSU
//        2014: ITMO
//        2015: ITMO
//        2016: ITMO
//        2017: ITMO
//        2018: SPbSU
//        2019: ITMO

//        switch (s) {
//            case "1995" ,
//                    "1998" , "1999" , "2001" ,"2002","2003","2004","2005","2009","2010","2011","2012","2014","2015","2016"
//                ,"2017","2019" : System.out.println("ITMO"); break;
//
//
//
//            case "1996","1997","2000","2007","2008","2013","2018" : System.out.println("SPbSU"); break;
//            case "2006" : System.out.println("PetrSU, ITMO"); break;
//        }

        if(s.equals("1995") || s.equals("1998") || s.equals("1999") || s.equals("2001") || s.equals("2002") || s.equals("2003")
        || s.equals("2004") || s.equals("2005") || s.equals("2009") || s.equals("2010") || s.equals("2011") || s.equals("2012")
        || s.equals("2014") || s.equals("2015") || s.equals("2016") || s.equals("2017") || s.equals("2019")) {
            System.out.println("ITMO");
        } else if (s.equals("1996") || s.equals("1997") || s.equals("2000") || s.equals("2007") || s.equals("2008") || s.equals("2013")
        || s.equals("2018")) {
             {
                 System.out.println("SPbSU");
            }
        }else {
            System.out.println("PetrSU, ITMO");
        }
    }
}
