package src1;

class Pessoa {
    String nome;
    int Cpf;
    int idade;

    Pessoa(String nome, int Cpf,int idade) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.idade = idade;
    }

}

public class DadoDaPessoa {
    public static void main(String[] args) {
        // Criação de um objeto
        Pessoa p1 = new Pessoa("João",239374,24);
        Pessoa p2 = new Pessoa("Maria",1244534,45);

        // Modificando o nome de p2
        p1.nome = "João";
        p2.nome = "Maria";
        p1.Cpf = 239374;
        p2.Cpf = 1244534;
        p1.idade = 24;
        p2.idade = 45;

        // Como p1 e p2 referenciam o mesmo objeto, a mudança afeta ambos
        System.out.println("O nome da pessoa: " + p1.nome);
        System.out.println("O idade da pessoa: " + p1.idade);
        System.out.println("O cpf da pessoa: " + p1.Cpf);
        System.out.println("O nome da pessoa: " + p2.nome);
        System.out.println("O idade da pessoa: " + p2.idade);
        System.out.println("O cpf da pessoa: " + p2.Cpf);
    }
}
