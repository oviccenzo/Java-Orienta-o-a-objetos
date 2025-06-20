package Entidades;

public class Produto {

    //Atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preoc, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodo de classes
    public double ValorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public void adicionaEstoque(int quantidade){
        //this.quantidade += quantidade;
        this.quantidade = this.quantidade + quantidade;
    }

    public void removeProduto(int quantidade){
        //this.quantidade = this.quantidade-quantidade;
        this.quantidade -= quantidade;
    }

    //metodo get e set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void imprimeDados(String legenda){
        System.out.printf("%s: %s, R$ %.2f, %d unidades, total: R$ %.2f %n",
                legenda, this.nome, this.preco, this.quantidade, this.ValorTotalEstoque());
    }
    public String toString(){
        return "Produto("+
                "nome='" + this.nome + '\''+
                ", preco=" + this.preco +
                ", quantidade=" + this.quantidade +
                ')';
    }
}