public class Main {
    public static void main(String[] args) {

        Cliente tarcnux = new Cliente();
        tarcnux.setNome("Tarcísio Nunes");

        Conta cc = new ContaCorrente(tarcnux);
        Conta cp = new ContaPoupanca(tarcnux);

        cc.depositar(100.98);
        cp.depositar(200.45);

        cp.transferir(50.45, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
