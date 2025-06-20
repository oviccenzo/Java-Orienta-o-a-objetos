package excecao;

public class EstoqueInsuficienteException extends Throwable {
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
