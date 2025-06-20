package src1;

import java.util.Locale;

public class exemplo1 {

    public static void main(String[] args) {

        //troca o padrão do teclado
        Locale.setDefault(Locale.US);

        int d = 20; //inteiro 
        long a = 25l; // long
        float y = 10.2f; //float 
        double x =  10.35784; //float

        System.out.printf(
                "valor de x = %.2f e o valor de y = %.1f %n",x,y);
        System.out.println("valor de x = " +x + " reais");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf(
                "%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

    }
}
