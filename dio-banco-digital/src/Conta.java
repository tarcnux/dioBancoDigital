
public class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cli;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cli = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// Saque da contaOrigem e depósito na contaDestino
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}	

	protected void imprimirInfoComum() {
		System.out.println(String.format("Cliente: %s", cli.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
}
