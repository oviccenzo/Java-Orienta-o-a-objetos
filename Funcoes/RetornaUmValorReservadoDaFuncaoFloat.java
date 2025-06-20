package Funcoes;

public class RetornaUmValorReservadoDaFuncaoFloat {

    public static float prod1(float t, float d){
        return t * d;
    }

    public static void main(String[] args){

        float saida;
        saida = prod1(45.23f , 02.67f);
        System.out.printf("A saida e: %f\n" , saida);
    }
}
