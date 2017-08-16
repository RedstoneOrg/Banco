package caelum.first;

/**
 * Created by ASUS on 16/08/2017.
 */
public class Banco {

    public Conta conta;

    public Banco(Conta conta){
        this.conta = conta;
    }

    public void depositar(double valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void sacar(double valor){
        if(valor > conta.getSaldo()){
            System.out.println(conta.getNome() + " não pode sacar o valor, é maior que seu saldo!");
            return;
        }
        conta.setSaldo(conta.getSaldo() - valor);
    }

    public int transferir(Conta target, double valor){
        if(target == null){
            System.out.println(conta.getNome() + " a conta não existe!");
            return 1;
        }
        if(valor > conta.getSaldo()){
            System.out.println(conta.getNome() + " não pode transferir o valor, é maior que seu saldo!");
            return 1;
        }

        target.setSaldo(target.getSaldo() + valor);
        conta.setSaldo(conta.getSaldo() - valor);
        return 2;
    }

}
