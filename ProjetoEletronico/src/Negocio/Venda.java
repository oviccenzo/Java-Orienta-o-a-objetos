package Negocio;

import Entidade.Produto;
import excecao.EstoqueInsuficienteException;


import java.time.LocalDateTime;

public class Venda {

    private Produto produto;
    private int QuantidadeVendida;

    private LocalDateTime DataVenda;

    private double ValorTotal;

    public Venda(Produto produto, int quantidade) throws EstoqueInsuficienteException{
        if(produto.getQuantidadeEmEstoque() < quantidade){
            throw new EstoqueInsuficienteException("Estoque insuficiente para o produto " + produto.getNome());
        }
        this.produto = produto;
        this.QuantidadeVendida = quantidade;
        this.DataVenda = LocalDateTime.now();
        this.ValorTotal = produto.getPreco() * quantidade;
        produto.AtualizarEstoque(-quantidade);
    }
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeVendida() {
        return QuantidadeVendida;
    }

    public LocalDateTime getDataVenda(){
        return DataVenda;
    }

    public double getValorTotal(){
        return ValorTotal;
    }
}
