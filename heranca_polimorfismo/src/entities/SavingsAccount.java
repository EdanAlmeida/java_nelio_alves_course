package entities;

public final class SavingsAccount extends Account {
	//a palavra 'final' evita que a classe possa ser herdade por outras classes

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//O override ajuda o compilador a entender a sobreposição
	//também ajuda o programador a ver a questão da sobreposição do método da superclasse
	@Override
	public final void withdraw(double amount) { //assinatura do método
		/*a palavra 'final' evita que o método possa ser sobreposto*/
		/*sobreposição multipla é uma porta para inconsistências*/
		balance -= amount;
	}
	
	/*o final melhora a perfromance em tempo de execução -> deserialização de json para objeto em memória*/
}
