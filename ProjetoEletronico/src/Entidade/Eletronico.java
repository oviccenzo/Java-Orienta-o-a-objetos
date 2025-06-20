package Entidade;

public class Eletronico extends Produto {

    private String Marca;
    private String Modelo;

    public Eletronico(String Codigo, String Nome, double Preco, int QuantidadeEmEstoque, String Marca, String Modelo){
        super(Codigo, Nome, Preco, QuantidadeEmEstoque);
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    @Override
    public String ObterDescrição(){
        return getCodigo() + " - " + this.nome + " - " + this.Marca + "  " + this.Modelo;
    }
}
