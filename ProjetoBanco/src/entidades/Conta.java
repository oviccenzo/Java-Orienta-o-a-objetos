package entidades;

public abstract class Conta {
    protected int numero;
    protected String proprietario;
    protected double saldo;

    public Conta(int numero, String proprietario, double saldo){
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public Conta(int numero, String proprietario){
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public abstract double sacar(double quantia);

    public void depositar(double quantia){
        this.saldo += quantia;
    }

    public void getProprietario(String proprietario){
        this.proprietario = proprietario;
    }

    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString(){
        return " Conta { " +
                " numero = " + numero +
                " , proprietario = '" + proprietario + '\'' +
                " , saldo =  " + saldo +
                '}';

    }
}
