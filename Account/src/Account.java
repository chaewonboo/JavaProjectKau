
public class Account {
	protected double balance;
	
	public int debit(double money){
		if(balance<=money){
			return -1;
		}
		balance-=money;
		return 1;
	}
	
	// add money at balance
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
	
	public Account(){}
	public Account(double first){
		//생성자 호출
		balance=first;
		//새로운 객체 만들때 괄호에 숫자 넣으면 그게 first라고 저장
	}
	//잔액수정 메서드
	protected void setBalance(double money){
		balance=money; 
	}
}
