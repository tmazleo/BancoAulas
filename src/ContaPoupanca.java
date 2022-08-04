public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero,int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                '}';
    }

    public double getSaldo(int dia){
        if (dia >= this.diaAniversario) {
            this.saldo = this.saldo + this.saldo * this.taxaJuros;
            return this.saldo;
        }
        else {
            return this.saldo;
        }
    }

    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return true;
    }
}
