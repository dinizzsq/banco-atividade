package Gerenciadores;
import Models.Conta;

public class Gerenciador_conta {

    public void depositar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void sacar(Conta conta, double valor){
        if (conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}