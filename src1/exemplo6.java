package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int horas;
        System.out.println("Digite a hora atual: ");
        horas= sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }else if(horas >= 12 && horas < 18){
            System.out.println("Boa tarde!");
        }else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
