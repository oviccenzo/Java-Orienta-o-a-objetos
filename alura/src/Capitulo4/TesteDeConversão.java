package Capitulo4;

import java.util.Scanner;

public class TesteDeConversão {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float PontoFltutuante = 3.14F;

        double Salario = 1270.50;
        int Valor = (int) Salario;
        System.out.println(STR."O valor é:  \{Valor}");

        double Valor1 = 0.11;
        double Valor2 = 0.22;
        double Valor3 = 0.33;
        double Valor4 = 0.34;
        double Total = Valor1 * Valor2 + Valor3 + Valor4;

        System.out.println(STR."O numero total é: \{Total}");
    }
}
