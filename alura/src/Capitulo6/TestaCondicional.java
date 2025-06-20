package Capitulo6;

public class TestaCondicional {
    public static void main(String[] args){

        int idade = 18;
        int QuantidadeDePessoas = 3;

        if(idade >= 18){
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if(QuantidadeDePessoas >= 2){
                System.out.println("Você não tem 18, mas pode entrar, "
                        + "pois está acompanhado");
            } else {
                System.out.println("Infelizmente você não pode entrar");
            }
        }
    }
}