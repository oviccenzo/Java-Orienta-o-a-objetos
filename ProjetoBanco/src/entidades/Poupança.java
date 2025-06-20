package entidades;

public final class Poupança extends Conta {

    private double taxaRendimento;

    public Poupança(int numero, String proprietario, double saldo, double taxaRendimento){
        super(numero, proprietario,saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public Poupança(int numeor, String proprietario, double taxaRendimento){
        super(numeor,proprietario);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public double sacar(double quantia){
        this.saldo -= quantia;
        return quantia;
    }

    public void aplicarRendimento(){
        this.saldo += this.taxaRendimento * (this.saldo / 100);
    }

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString(){
        return " Poupanca { " +
                " taxaRendimento = " + taxaRendimento +
                ", numero = " + numero +
                ", proprietario =  '" + proprietario + '\'' +
                ", saldo = " + saldo + '}';
    }
}
