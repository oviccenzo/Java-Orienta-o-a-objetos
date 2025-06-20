package Capitulo7;

public class TesteConversão {
    public static void main(String[] args){

        float PontoFlutuante = 3.14f;

        double salario = 1670.50;
        int valor = (int) salario;
        System.out.println("O valor é: " + valor);

        double valor1 = 0.12;
        double valor2 = 0.7;
        double valortotal = valor1 + valor2;
        System.out.println("O valor total é: "+valortotal);
    }
}
