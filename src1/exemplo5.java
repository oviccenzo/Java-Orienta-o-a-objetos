package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        //esse nextLine consome a quebra de linha do nextInt
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados Digitados");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
