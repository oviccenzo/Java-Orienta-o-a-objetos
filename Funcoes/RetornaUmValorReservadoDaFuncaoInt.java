package Funcoes;

public class RetornaUmValorReservadoDaFuncaoInt {

    public static int prod(int x, int y){
        return x * y;
    }

    public static void main(String[] args){

        int saida;
        saida = prod(12,7);
        System.out.printf("A saida e: %d\n", saida);
    }
}
