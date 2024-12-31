package entities;

public class Conta {
    private int numeroConta;
    private String nomeConta;
    private double saldoConta;

    public Conta(int numeroConta,String nomeConta) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
    }

    public Conta(int numeroConta, String nomeConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void deposito(double novoDeposito){
        saldoConta += novoDeposito;
    }

    public void saque(double novoSaque){
        saldoConta -= novoSaque + 5.0;
    }

    public String toString(){
        return  "Conta: " + getNumeroConta()
                +"\nNome: " + getNomeConta()
                +"\nSaldo: " + "R$ "+ String.format("%.2f",getSaldoConta());
    }
}
