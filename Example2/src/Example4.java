//savingsaccount class
public class Example4 extends Example2{
	private int save=0;
	private double interest;
	public Example4(double balance, double inter){
		super(balance);
		this.interest = inter;
	}
	@Override
	public void debit(double minMoney) throws Exception{
		if(minMoney<0){
			throw new Exception("음수입력!");
		}
		else{
			throw new Exception("Debit amount exceeded account balance");
		}
		/*if(save<12){
			System.out.printf("아직 출금할 수 없습니다.\n");
		}
		else if(save>=12){
			balance=balance-minMoney;
		}
		return 1;*/
	}
	@Override
	public double getWithdrawableAccount(){
		if(save<12){
			return 0.0;
		}else{
			return getBalance();
		}
	}
	@Override
	public int passTime(int month){
		save+=month;
		if(save<=12){	
			balance=balance*Math.pow(1+interest,month);
		}else{
			return 1;
		}
		return 1;
	}
	@Override
	public int passTime(){
		return passTime(1);
	}
	
	@Override
	public double EstimateValue(int month){
		balance=balance*Math.pow(1+interest,month);
		return balance;
	}
	
	@Override
	public double EstimateValue(){
		return EstimateValue(1);//인자 있는게 실행 됨 그래서 위에꺼 인자있는 EstimateValue(int month)가 불
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: 100.00");
	}
}
