import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String plainText = br.readLine();
        String sha256 = "" ;

        try {

            MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");

            mdSHA256.update(plainText.getBytes("UTF-8"));

            byte[] sha256Hash = mdSHA256.digest();

            StringBuffer hexSHA256hash = new StringBuffer();

            for(byte b : sha256Hash) {
                String hexString = String.format("%02x", b);
                hexSHA256hash.append(hexString);
            }
            sha256 = hexSHA256hash.toString();
        }catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }System.out.println(sha256);


    }

}
