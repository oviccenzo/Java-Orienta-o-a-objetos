package Conta;

public class Conta {
    double saldo;
    int agencia;
    double numero;
    String titular;

    public void deposita(double valor){
        this.saldo += valor;

    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    
}
