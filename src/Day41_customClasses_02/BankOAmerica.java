package Day41_customClasses_02;

public class BankOAmerica {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountHolder= "Bill Gates";
		acc1.accountNumber= 12345;
		acc1.deposit(250.0);
		acc1.withdraw(100.0);
		acc1.showBalance();acc1.charge(50, "Wooden Spoon");
		acc1.showBalance();
	}
}
