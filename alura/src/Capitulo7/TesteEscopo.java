package Capitulo7;

public class TesteEscopo {

    public static void main(String[] args){
        System.out.println("Testando Condicionais");

        int idade = 29;
        int QuantidadeDePessoas = 6;
        boolean acompanhada;

        if(QuantidadeDePessoas <= 9){
            acompanhada = true;
        } else{
            acompanhada = false;
        }

        if(idade >= 19 || acompanhada){
            System.out.println("Srja bem vinda");
        } else{
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
