package caelum.first;

/**
 * Created by ASUS on 16/08/2017.
 */
public class Conta {

    private String nome;
    private int numero;
    private double saldo;
    private double limite;

    public Conta(String nome, int numero, double saldo, double limite){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
