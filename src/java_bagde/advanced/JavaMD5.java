package java_bagde.advanced;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(s.getBytes());
        System.out.println(DatatypeConverter.printHexBinary(md5.digest()).toLowerCase());
    }
}
