package entities;

public class AccountBank {

	private int numberAccount;
	private String holderAccount;
	private double balance;

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getBalance() {
		return balance;
	}

	public AccountBank(int numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public AccountBank(int numberAccount, String holderAccount, double initialDesposit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		deposit(initialDesposit);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numberAccount
				+", Holder: "
				+ holderAccount
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
