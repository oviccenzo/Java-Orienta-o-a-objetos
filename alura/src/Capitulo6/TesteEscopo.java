package Capitulo6;

public class TesteEscopo {
    public static void main(String[] args){

        int idade = 20;
        int QuantidadeDePessoas = 3;
        boolean Acompanha;

        if(QuantidadeDePessoas >= 2){
            Acompanha = true;
        } else {
            Acompanha = false;
        }

        if(idade >= 18 || Acompanha){
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
