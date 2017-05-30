
 public class CheckingAccount extends Account {
	 private double credit_limit;
	 private double interest;
	 private double loan_interest;
	 
	 public CheckingAccount(double balance){
	      super(balance);
	      this.credit_limit = 100.0;
	      this.interest = 0.01;
	      this.loan_interest = 0.7; //대출이자
	   }
	 //상속 오버라이드
	 @Override public int debit(double money){
		 balance-=money;
		 if(balance<=0){
			 return 2;
		 }
		 if(balance<=credit_limit){
			 System.out.printf("bankruptcy\n");
			 balance+=money;
			 return -1;
		 }
		 return 1;
	 }
	 //이자
	 public void nextMonth(){
		 if(balance>0){
			balance=balance+(balance*interest);
		 }
		 else if(balance<0){
			 balance=balance+(balance*loan_interest);
		 }
	 }
}
