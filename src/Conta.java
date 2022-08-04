public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return this.saldo;
    };
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public Conta(int numero, int agencia, String banco, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public  boolean sacar(double quantia) {
        return false;
    };

    public void depositar(double quantia) {
        this.saldo += quantia;
    }
}
