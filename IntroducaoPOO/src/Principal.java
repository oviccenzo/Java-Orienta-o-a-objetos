import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Produto p = new Produto();
        Produto p;

        //System.out.println("Tipo da classe: " + p.getClass());
        //System.out.println(p);

        System.out.println("Entre com os dados do produto");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        //p.setNome(nome);
        //p.setNome(sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        //p.setPreco(sc.nextDouble());
        System.out.println("Quantidade de Estoque: ");
        int quantidade = sc.nextInt();
        //p.setQuantidade(sc.nextInt());
        p = new Produto(nome,preco,quantidade);
        p.imprimeDados("Dados do Produto");
        System.out.println("Entre com o numero de produtos que deseja adicionar no estoque: ");
        //int quantidade = sc.nextInt();
        //p.adicionaEstoque(quantidade);
        p.adicionaEstoque(sc.nextInt());
        p.imprimeDados("Atualização dos Dados do Produto");
        System.out.print("Atualização dos Dados do Produto");
        p.removeProduto(sc.nextInt());
        p.imprimeDados("Atualização dos Dados do Produto:");

        sc.close();
    }
}
