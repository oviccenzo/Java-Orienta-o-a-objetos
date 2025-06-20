package Entidade;

public class Eletrodomestico extends Produto {

    private int Voltagem;
    private int Potencia;


    public Eletrodomestico(String codigo, String nome, double preco, int quantidadeEmEstoque, int voltagem, int potencia) {
        super(codigo , nome, preco,quantidadeEmEstoque);
        this.Voltagem = Voltagem;
        this.Potencia = Potencia;
    }


    @Override
    public String ObterDescrição(){
        return getCodigo() +  " - " + getNome() + " - " + Voltagem +  " V, " + Potencia + " W ";
    }
}