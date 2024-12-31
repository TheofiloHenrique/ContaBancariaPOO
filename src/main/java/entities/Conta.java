package entities;

public class Conta {
    private int numeroConta;
    private String nomeConta;
    private double saldoConta;

    public Conta(int numeroConta,String nomeConta) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
    }

    public Conta(int numeroConta, String nomeConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public void deposito(double novoDeposito){
        this.saldoConta += novoDeposito;
    }

    public void saque(double novoSaque){
        this.saldoConta -= novoSaque - 5.00;
    }


}
