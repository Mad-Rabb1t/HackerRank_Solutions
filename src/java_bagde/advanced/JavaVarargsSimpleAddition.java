package java_bagde.advanced;

import java.util.Scanner;
import java.util.StringJoiner;

public class JavaVarargsSimpleAddition {

    static class Add {
        static String add(int ... args) {
            int sum = 0;
            StringJoiner sj = new StringJoiner("+");
            for (int arg : args) {
                sj.add(String.valueOf(arg));
                sum += arg;
            }
            return String.join("=", sj.toString(), String.valueOf(sum));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        int i6 = sc.nextInt();

        System.out.println(Add.add(i1,i2));
        System.out.println(Add.add(i1,i2, i3));
        System.out.println(Add.add(i1,i2, i3, i4, i5));
        System.out.println(Add.add(i1,i2, i3, i4, i5, i6));

    }
}
