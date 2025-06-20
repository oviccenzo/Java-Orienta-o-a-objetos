package Entidade;

public class Movel extends Produto {

    private String Material;
    private String Dimensões;

    public Movel(String codigo, String nome, double preco, int quantidadeEmEstoque, String material, String dimensao) {
        super(codigo,nome,preco,quantidadeEmEstoque);
        this.Material = material;
        this.Dimensões = dimensao;
    }



    @Override
    public String ObterDescrição(){
        return getCodigo() + " - " + getNome() + " - " + Material + "(" + Dimensões + ")";
    }
}
