//checkingccount class
import java.util.Scanner;

public class Example3 extends Example2{
	private double credit_limit;//대출받을수 있는한도 마이너스 한
	private double interest;
	private double loan_interest;
	
	Example3(){}
	Example3(double balance, double c_limit, double interest, double l_interest){
		super(balance);
		credit_limit=c_limit;
		this.interest=interest;
		loan_interest=l_interest;
	}
	
	@Override
	public void debit(double minMoney)throws Exception{
		//throw new Exception 은 예외에 던진다.
		if(minMoney<0){
			throw new Exception("음수입력!");
		}
		if(balance<credit_limit*(-1)){
			throw new Exception("Debit amount exceeded account balance");
		}
		/*balance-=minMoney;
		if(balance<credit_limit*(-1)){
			System.out.println("bankrupty!");
			balance+=minMoney;
			return -1;
		}
		else if(balance<0){
			return 2;
		}
		return 1;*/
	}
	public void nextMonth(){
		if(balance>=0){
			balance+=(balance*interest);
		}
		else if(balance<0){
			balance+=(balance*loan_interest);
		}
	}
	@Override
	public double getWithdrawableAccount(){
		if(balance>0){
			return (balance+credit_limit);
		}else if(balance<0 && balance>=-50){
			return (balance+credit_limit);
		}
		else{
			return 0.0;
		}
	}
	
	@Override
	public int passTime(int month){
		if(balance>0){
			balance=balance+(balance*(interest*month));
			return 1;
		}else if(balance<0){
			balance=balance+(balance*(loan_interest*month));
			return 1;
		}
		return 1;
	}
	
	@Override
	public int passTime(){
		return passTime(1);
	}
	
	public boolean isBankrupted(){
		if(balance<=-50.00){
			return true;
		}
		return false;
	}
	@Override
	public double EstimateValue(int month){
		balance=balance+(balance*(interest*month));
		return balance;
	}
	@Override
	public double EstimateValue(){
		return EstimateValue(1);
	}
	public String toString(){
		return String.format("CheckingAccount_Balance: 100.00");
	}
	
}
