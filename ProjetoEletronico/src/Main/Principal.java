package Main;

import excecao.CodigoProdutoDuplicadoException;
import excecao.EstoqueInsuficienteException;
import Negocio.Lojas;

public class Principal {
    public static void main(String[] args){
        Lojas loja = new Lojas();
        loja.Iniciar();

    }
}
