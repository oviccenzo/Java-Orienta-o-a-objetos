package Negocio;

import Entidade.Produto;
import excecao.EstoqueInsuficienteException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeVendas {
    private List<Venda> vendas;

    public GerenciadorDeVendas(){
        this.vendas = new ArrayList<>();
    }


    public void RegistrarVenda(Venda VendaRealizada) throws EstoqueInsuficienteException {
        Venda venda = VendaRealizada;
        vendas.add(venda);
    }


    public List<Venda> ListarVendas(){
        return vendas;
    }

    public double CalcularTotalVendas(){
        double Total = 0;
        for(Venda venda : vendas){
            Total += venda.getValorTotal();
        }
        return Total;
    }

    public void ImprimiCopumFiscal(){
        System.out.println("Cupom Fiscal");
        for(Venda venda : vendas){
            Produto produto = venda.getProduto();
            System.out.printf("Produto: %s, Quantidade: %d , Valor: %.2f %n", produto.getNome(), venda.getQuantidadeVendida());
        }
    }
}
