package Models;

public class Conta {

    private String nome;
    private int idade;
    private double saldo;
    private String cpf;

    public Conta(String nome, int idade, double saldo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Gerenciador_conta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", deposito_inicial=" + saldo +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
