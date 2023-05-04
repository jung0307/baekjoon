
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        String[] aa = s[0].split("");
        String[] bb = s[1].split("");

        String a[];
        String b[];

        if(!s[0].contains("1")) {
            a = new String[1];
            a[0] = "0";
        }else {
            boolean tf1 = false;
            int count1 = 0;

            for(int i = 0; i < aa.length; i++) {
                if(tf1 == true) {
                    count1++;
                }else {
                    if(aa[i].equals("1")) {
                        count1++;
                        tf1 = true;
                    }
                }
            }

            a = new String[count1];

            tf1 = false;
            int j = 0;
            for(int i = 0; i < aa.length; i++) {
                if(tf1 == true) {
                    a[j] = aa[i];
                    j++;
                }else {
                    if(aa[i].equals("1")) {
                        a[j] = aa[i];
                        j++;
                        tf1 = true;
                    }
                }
            }

        }
        if(!s[1].contains("1")) {
            b = new String[1];
            b[0] = "0";
        }else {

            boolean tf2 = false;
            int count2 = 0;

            for(int i = 0; i < bb.length; i++) {
                if(tf2 == true) {
                    count2++;
                }else {
                    if(bb[i].equals("1")) {
                        count2++;
                        tf2 = true;
                    }
                }
            }

            b = new String[count2];

            tf2 = false;
            int j = 0;
            for(int i = 0; i < bb.length; i++) {
                if(tf2 == true) {
                    b[j] = bb[i];
                    j++;
                }else {
                    if(bb[i].equals("1")) {
                        b[j] = bb[i];
                        j++;
                        tf2 = true;
                    }
                }
            }
        }

        ArrayList<String> arrayList = new ArrayList<>();

        if(a.length > b.length) {
            for(int i = 0; i < a.length; i++) {
                if(i < b.length) {
                    if(Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 2) {
                        arrayList.add("0");
                        a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 1) {
                        arrayList.add("1");
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 0) {
                        arrayList.add("0");
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 3) {
                        arrayList.add("1");
                        a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                    }
                }else {
                    if(Integer.parseInt(a[a.length - 1 - i]) == 2) {
                        arrayList.add("0");

                        if(i == a.length - 1) {
                            arrayList.add("1");
                        }else {
                            a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                        }

                    } else if (Integer.parseInt(a[a.length - 1 - i]) == 1) {
                        arrayList.add("1");
                    } else if (Integer.parseInt(a[a.length - 1 - i]) == 0) {
                        arrayList.add("0");
                    } else if (Integer.parseInt(a[a.length - 1 - i])  == 3) {
                        arrayList.add("1");

                        if(i == a.length - 1) {
                            arrayList.add("1");
                        }else {
                            a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                        }
                    }
                }
            }
        }else if(a.length < b.length) {
            for(int i = 0; i < b.length; i++) {
                if(i < a.length) {
                    if(Integer.parseInt(b[b.length - 1 - i]) + Integer.parseInt(a[a.length - 1 - i]) == 2) {
                        arrayList.add("0");
                        b[b.length - 1 - (i+1)] = (Integer.parseInt(b[b.length - 1 - (i+1)]) + 1) + "";
                    } else if (Integer.parseInt(b[b.length - 1 - i]) + Integer.parseInt(a[a.length - 1 - i]) == 1) {
                        arrayList.add("1");
                    } else if (Integer.parseInt(b[b.length - 1 - i]) + Integer.parseInt(a[a.length - 1 - i]) == 0) {
                        arrayList.add("0");
                    } else if (Integer.parseInt(b[b.length - 1 - i]) + Integer.parseInt(a[a.length - 1 - i]) == 3) {
                        arrayList.add("1");
                        b[b.length - 1 - (i+1)] = (Integer.parseInt(b[b.length - 1 - (i+1)]) + 1) + "";
                    }
                }else {
                    if(Integer.parseInt(b[b.length - 1 - i]) == 2) {
                        arrayList.add("0");

                        if(i == b.length - 1) {
                            arrayList.add("1");
                        }else {
                            b[b.length - 1 - (i+1)] = (Integer.parseInt(b[b.length - 1 - (i+1)]) + 1) + "";
                        }
                    } else if (Integer.parseInt(b[b.length - 1 - i]) == 1) {
                        arrayList.add("1");
                    } else if (Integer.parseInt(b[b.length - 1 - i]) == 0) {
                        arrayList.add("0");
                    } else if (Integer.parseInt(b[b.length - 1 - i])  == 3) {
                        arrayList.add("1");

                        if(i == b.length - 1) {
                            arrayList.add("1");
                        }else {
                            b[b.length - 1 - (i+1)] = (Integer.parseInt(b[b.length - 1 - (i+1)]) + 1) + "";
                        }
                    }
                }
            }
        } else {
            for(int i = 0; i < a.length; i++) {
                    if(Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 2) {
                        arrayList.add("0");
                        if(i == a.length - 1) {
                            arrayList.add("1");
                        }else {
                            a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                        }
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 1) {
                        arrayList.add("1");
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 0) {
                        arrayList.add("0");
                    } else if (Integer.parseInt(a[a.length - 1 - i]) + Integer.parseInt(b[b.length - 1 - i]) == 3) {
                        arrayList.add("1");
                        if(i == a.length - 1) {
                            arrayList.add("1");
                        }else {
                            a[a.length - 1 - (i+1)] = (Integer.parseInt(a[a.length - 1 - (i+1)]) + 1) + "";
                        }
                    }
            }
        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(arrayList.size() - 1 - i));
        }

    }
}
