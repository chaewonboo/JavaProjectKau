
public class SavingAccount extends Account2{
	private double interest;
	private int save=0;
	public SavingAccount(double balance, double inter){
		super(balance);
		this.interest = inter;
	}
	public boolean isBankrupted(){
		return true;
	}
	@Override public int debit(double money)throws Exception{
		if(save<12)throw new Exception("아직 출금할수 없습니다.");
		if(balance<=money)throw new Exception("Debit amount exceeded account balance.");
		if(money<0)throw new Exception("음수입력!");
		if(save>12){
			balance=balance-money;
		}
		return 1;
	}
	@Override public double getWithdrawableAccount(){
		if(save<12){
			return 0.0;
		}else{
			return getBalance();
		}
	}
	@Override public int passTime(int month){
		save+=month;
		if(save<=12){	
			balance=balance*Math.pow(1+interest,month);
		}else{
			return 1;
		}
		return 1;
	}
	//여기
	@Override public int passTime(){
		return passTime(1);
	}
	@Override public double EstimateValue(int month){
		balance=balance*Math.pow(1+interest,month);
		return balance;
	}
	//여기
	@Override public double EstimateValue(){
		return EstimateValue(1);
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: 100.00");
	}

	
}
