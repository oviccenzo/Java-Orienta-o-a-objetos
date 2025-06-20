package entidades;

public class ContaCorrente extends Conta {

    private double limiteEmprestimo;

    //public ContaCorrente() {
    //
    // }

    public ContaCorrente(int numero, String proprietario, double saldo, double limiteEmprestimo){super(numero,proprietario,saldo);this.limiteEmprestimo = limiteEmprestimo;}

    public ContaCorrente(int numero, String proprietario, double limiteEmprestimo){super(numero,proprietario);this.limiteEmprestimo = limiteEmprestimo;}

    @Override
    public final double sacar(double quantidade){this.saldo -= quantidade + 3.0;return quantidade;}

    public void emprestimo(double quantia){this.limiteEmprestimo -= quantia;this.saldo += quantia;}

    public double getLimiteEmprestimo(){return limiteEmprestimo;}

    @Override
    public String toString(){
        return " ContaCorrente { "+
                " limiteEmprestimo = " + limiteEmprestimo +
                ", numero = " + numero +
                ", proprietario = '" + proprietario + '\'' +
                ", saldo = " + saldo +
                '}';
    }
}
