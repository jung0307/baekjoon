public class Main {

    public static void main(String[] args) {

        for(int i = 1000; i <= 9999; i++) {

            if(m_10(i) == m_12(i) && m_10(i) == m_16(i)) {
                System.out.println(i);
            }
        }

    }

    static int m_10(int a) {
        String s[] = (a+"").split("");
        int c = 0;

        for(int i = 0; i < s.length; i++) {
            c = c + Integer.parseInt(s[i]);
        }

        return c;
    }

    static int m_12(int a) {
       StringBuilder sb = new StringBuilder();
        String s[];
        int c = 0;

        while (a > 0) {
            if(a%12 < 10) {
                sb.append(a%12 + "");
            }else {
                if((a%12) == 10) {
                    sb.append("A");
                }else {
                    sb.append("B");
                }
            }

            a = a / 12;
        }
        s = sb.toString().split("");

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("A")) {
                c = c + 10;
            } else if (s[i].equals("B")) {
                c = c + 11;
            }else {
                c = c + Integer.parseInt(s[i]);
            }
        }

        return c;

    }
    static int m_16(int a) {
        StringBuilder sb = new StringBuilder();
        String s[];
        int c = 0;

        while (a > 0) {
            if(a%16 < 10) {
                sb.append(a%16 + "");
            }else {
                if((a%16) == 10) {
                    sb.append("A");
                }else if ((a%16) == 11){
                    sb.append("B");
                }else if ((a%16) == 12){
                    sb.append("C");
                }else if ((a%16) == 13){
                    sb.append("D");
                }else if ((a%16) == 14){
                    sb.append("E");
                }else if ((a%16) == 15){
                    sb.append("F");
                }
            }

            a = a / 16;
        }

        s = sb.toString().split("");

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("A")) {
                c = c + 10;
            } else if (s[i].equals("B")) {
                c = c + 11;
            } else if (s[i].equals("C")) {
                c = c + 12;
            } else if (s[i].equals("D")) {
                c = c + 13;
            } else if (s[i].equals("E")) {
                c = c + 14;
            } else if (s[i].equals("F")) {
                c = c + 15;
            }
            else {
                c = c + Integer.parseInt(s[i]);
            }
        }

        return c;
    }
}
