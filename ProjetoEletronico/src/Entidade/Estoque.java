package Entidade;

import excecao.CodigoProdutoDuplicadoException;

import java.util.ArrayList;
import java.util.List;


public class Estoque {
    private List<Produto> produtos;

    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    public void AdcionarProduto(Produto produto) throws CodigoProdutoDuplicadoException{
        for(Produto p: produtos){
            if(p.getCodigo().equals(produto.getCodigo())){
                throw new CodigoProdutoDuplicadoException("Produto com código " + produto.getCodigo() + " já existe");
            }
        }
        produtos.add(produto);
    }

    public void RemoverProduto(Produto produto) {
        produtos.remove(produtos);
    }

    public Produto BuscarProdutoPorCodigo(String codigo){
        for(Produto p : produtos){
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        return null;
    }

    public List<Produto> ListarProdutos(){
        return produtos;
    }
}
