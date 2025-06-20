package Funcoes;

public class Divisoes {

    public static int[] divide(int dividendo, int divisor){
        int quociente = dividendo/divisor;
        int resto = dividendo % divisor;
        return new int[] {quociente,resto};
    }

    public static void main(String[] args){
        int[] resultado = divide( 10,3 );
        System.out.println("Quociente: " + resultado[0] + " Resto: " + resultado[1]);    }
}
