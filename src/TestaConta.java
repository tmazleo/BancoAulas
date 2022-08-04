
public class TestaConta {
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(1,1,"aa",100,1000);
        ContaPoupanca cp = new ContaPoupanca(2,1,"aa",100,20,0.05);
        ContaSalario cs = new ContaSalario(3,1,"aa",1000,3);

        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        System.out.println("saldo atual: " + cp.getSaldo(25));
    }
}
