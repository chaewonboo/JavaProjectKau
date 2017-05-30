import java.util.*;
public abstract class Account2 implements Valuable{
	protected double balance;
	
	public int debit(double money) throws Exception{
		balance-=money;
		return 1;
	}
	
	public void credit(double money){
		balance+=money;
	}
	
	//balance print
	public double getBalance(){
		return balance;
	}
	
	/*
	public void setBalance(){
		
	}
	*/
	
	public Account2(){}
	public Account2(double first){
		//생성자 호출
		balance=first;
		//새로운 객체 만들때 괄호에 숫자 넣으면 그게 first라고 저장
	}
	//잔액수정 메서드
	protected void setBalance(double money){
		balance=money; 
	}
	

	//현재출금 가능한 금액을 확인한다.
	public abstract double getWithdrawableAccount();

	//기간을 인자로 받아 해당기간이 지난후 이자를 계산해준
	public abstract int passTime(int month);
	public abstract int passTime();
	
	
	public abstract boolean isBankrupted();
	//여기는 abstract class니까 Estimatevalue다시선언 필요x
	//상속당하는 클래스에만 하면됨 checking && saving
	
	//마지막실습 
	public static double sumForAccount(ArrayList<? extends Account2> list){
		double sum=0;
		for(Account2 account :list){
			sum+=account.getBalance();
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<? extends Account2> list, int month){
		for(Account2 account :list){
			account.passTime(month);
		}
	}
}
