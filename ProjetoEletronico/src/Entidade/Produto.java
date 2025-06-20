package Entidade;

public abstract class Produto {
    protected String codigo;
    protected String nome;
    protected double preco;
    protected int QuantidadeEmEstoque;

    public Produto(String codigo, String nome, double preco, int QuantidadeEmEstoque){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.QuantidadeEmEstoque = QuantidadeEmEstoque;
    }



    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEmEstoque(){
        return QuantidadeEmEstoque;
    }

    public void AtualizarEstoque(int Quantidade){
        this.QuantidadeEmEstoque += Quantidade;
    }

    public abstract String ObterDescrição();

}
