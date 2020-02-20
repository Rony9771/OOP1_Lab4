package aiub.Lab4;

public class Account {
	
		private String accName;
		private String acId;
		private int balance; 
		
		public Account() {
			
		}
		public Account(String accName, String acId, int balance) {
			super();
			this.accName = accName;
			this.acId = acId;
			this.balance = balance;
		} 
		public void deposit(int Balance) {
			System.out.println("Deposit: "+Balance);
			
			
		}
		public void withdraw(int Balance) {
			System.out.println("Withdraw: "+Balance);
			
		}
		@Override
		public String toString() {
			return "Account [accName=" + accName + ", acId=" + acId + ", balance=" + balance + "]";
		}
		
		
		}
		 
		


