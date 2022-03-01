package java_bagde.advanced;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        sha256.update(s.getBytes());
        System.out.println(DatatypeConverter.printHexBinary(sha256.digest()).toLowerCase());
    }
}
