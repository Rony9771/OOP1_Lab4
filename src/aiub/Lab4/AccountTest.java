package aiub.Lab4;

public class AccountTest {
	

		public static void main(String[] args) {
			Account a1=new Account("Savings","17-34738-2",50000);
			System.out.println(a1);
			
			a1.deposit(10000);
			a1.withdraw(20000);

		}


}
