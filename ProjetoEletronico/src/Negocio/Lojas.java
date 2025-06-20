package Negocio;

import Entidade.*;
import excecao.CodigoProdutoDuplicadoException;
import excecao.EstoqueInsuficienteException;

import java.util.List;
import java.util.Scanner;

public class Lojas {

    private Estoque estoque = new Estoque();
    private GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas();
    private Scanner sc = new Scanner(System.in);

    public void Iniciar(){
        Produto produto;
        //Opção 1 armazena a escolha do menu do programa, opção 2 armazena a escolha do meu do cadastro de produto
        int opcao1 = 0, opcao2 = 0;
        do{
            try{
                opcao1 = this.menu();
                    switch (opcao1)
                    {
                        case 1:
                            opcao2 = this.menuProduto();
                            produto = this.cadastroProduto(opcao2);
                            estoque.AdcionarProduto(produto);
                            break;
                        case 2:
                            Venda venda = this.cadastraVenda();
                            this.gerenciadorDeVendas.RegistrarVenda(venda);
                            break;
                        case 3:
                            this.listaEstoque();
                            break;
                        case 4:
                            this.RelatorioVenda();
                            break;
                        case 5:
                            System.out.printf("Adeus!!!");
                            break;
                    }
            } catch (CodigoProdutoDuplicadoException e){
                e.printStackTrace();
            } catch (EstoqueInsuficienteException e){
                e.printStackTrace();
            }
        } while(opcao1 != 5);
    }

    private void RelatorioVenda(){
        System.out.println("Relatorios de vendas");
        this.gerenciadorDeVendas.ImprimiCopumFiscal();
        double Total = this.gerenciadorDeVendas.CalcularTotalVendas();
        System.out.printf("Total da venda: %.2f%n", Total);
    }

    private void listaEstoque(){
        System.out.println("Estoque");
        List<Produto> listaProdutoEstoque  = estoque.ListarProdutos();
        for(Produto p: listaProdutoEstoque){
            System.out.println(p.ObterDescrição());
        }
    }

    private Venda cadastraVenda() throws EstoqueInsuficienteException{
        System.out.println("Cadastro de Venda");
        this.listaEstoque();
        System.out.printf("Digite o codigo do produto: ");
        String codigo = sc.nextLine();
        Produto produto = estoque.BuscarProdutoPorCodigo(codigo);
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        Venda venda = new Venda(produto, quantidade);
        return venda;
    }

    private Produto cadastroProduto(int NumeroPedido){
        Produto produto;
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeEmEstoque = sc.nextInt();
        sc.nextLine();
        if(NumeroPedido == 1){
            System.out.println("Voltagem: ");
            int voltagem = sc.nextInt();
            sc.nextLine();
            System.out.println("Potencia: ");
            int potencia = sc.nextInt();
            sc.nextLine();
            produto = new Eletrodomestico(codigo,nome,preco,quantidadeEmEstoque,voltagem,potencia);
            return produto;
        } else if(NumeroPedido == 2){
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            produto = new Eletronico(codigo,nome,preco,quantidadeEmEstoque,marca,modelo);
            return produto;
        } else{
            System.out.println("Material: ");
            String material = sc.nextLine();
            System.out.println("Dimensões: ");
            String dimensao = sc.nextLine();
            produto = new Movel(codigo,nome,preco,quantidadeEmEstoque,material,dimensao);
            return produto;
        }
    }

    private int menuProduto(){
        int escolha = 0;
        do{
            System.out.println("Cadastro de produto");
            System.out.println(" 1 - Eletrodomestico");
            System.out.println(" 2 - Eletronico");
            System.out.println(" 3 - Movel");
            System.out.print(" Escolha um numero: ");
            escolha = sc.nextInt();
            sc.nextLine();
            if(escolha < 1 || escolha > 3){
                System.out.println( "Opção invalida!!!" );
            }
        }while(escolha < 1 || escolha > 3);
        return  escolha;
    }

    private int menu(){
        int escolha = 0;
        do{
            System.out.println("Menu");
            System.out.println("1 - Cadastro de Produto");
            System.out.println("2 - Realizar uma venda");
            System.out.println("3 - Imprimir estoque");
            System.out.println("4 - Relatorios de vendas");
            System.out.println("5 - Sair");
            System.out.print("Escolha um numero: ");
            escolha = this.sc.nextInt();
            sc.nextLine();
            if(escolha < 1 || escolha > 5){
                System.out.println( "Opção invalida!!!" );
            }
        } while (escolha < 1 || escolha > 4);
        return escolha;
    }
}
