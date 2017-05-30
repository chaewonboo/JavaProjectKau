
 public class CheckingAccount2 extends Account2{
	 private double credit_limit;
	 private double interest;
	 private double loan_interest;
	 
	 public CheckingAccount2(double balance,double creditlim, double inter, double loan){
	      super(balance);
	      this.credit_limit = creditlim;
	      this.interest = inter;
	      this.loan_interest = loan; //대출이자
	   }
	 //상속 오버라이드
	 @Override public int debit(double money) throws Exception{
		 if(balance+credit_limit<=money)throw new Exception("Debit amount exceeded account balance.");
		 if(money<0)throw new Exception("음수입력!");
		 if(balance<=credit_limit){
			 System.out.printf("bankruptcy\n");
			 balance+=money;
			 return -1;
		 }
		 
		 balance-=money;
		 return 1;
	 }
	 
	@Override public double getWithdrawableAccount(){
		if(balance>0){
			return (balance+credit_limit);
		}else if(balance<=0 && balance>=-50){
			return (credit_limit+balance);
		}else{
			return 0.0;
		}
	}
	@Override public int passTime(int month){
		if(month>0){
			 if(balance>0){
					balance=balance+(balance*(interest*month));
			 }else if(balance<=0){
				 	balance=balance+(balance*(loan_interest*month));
			 }	
		 }
		return 1;
	}
	@Override public int passTime(){
		return passTime(1);
	}
	public boolean isBankrupted(){
		if(balance<=-50.00){
			System.out.printf("account1 went Bankrupt\n");
			return true;
		}
		return true;
	}
	@Override public double EstimateValue(int month){
		balance=balance+(balance*(interest*month));
		return balance;
	}
	public String toString(){
		return String.format("CheckingAccount_Balance: 100.00");
	}
	
	@Override public double EstimateValue(){
		return EstimateValue(1);
	}
}
