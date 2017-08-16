package caelum.first;

public class Main {

    public static void main(String[] args) {

        Conta[] contas = new Conta[]{
                new Conta("Drogba", 3453, 0, 300),
                new Conta("Brain", 3584, 500, 900)
        };

        Banco banco = new Banco(contas[0]);
        banco.depositar(350);
        System.out.println(contas[0].getNome() + " depositou 350 reais!");

        if(banco.transferir(contas[1], 300) == 2){
            System.out.println(contas[0].getNome() + " transferiu 300 para " + contas[1].getNome());
        }
        System.out.println(contas[0].getNome() + " tem um saldo de " + contas[0].getSaldo());

    }

}
