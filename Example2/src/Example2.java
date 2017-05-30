//account class
import java.util.Scanner;

public abstract class Example2 implements Example5{
	protected double balance;
	
	//더하는 함수 호출
	public void credit(double plusMoney){
		balance+=plusMoney;
	}
	
	//빼는 함수 호출 
	public void debit(double minMoney) throws Exception{
		balance-=minMoney;
		//5번째 실습 전까지는 이 주석문 사용
		/*if(balance<minMoney){
			System.out.printf("Debit amount exceeded account balance\n");
			return -1;
		}else{
			balance-=minMoney;
			return 0;
		}*/
	}
	
	//프린트 하는 함수 호출  
	public double getBalance(){
		return balance;
	}
	//생성자 make
	Example2(){}
	Example2(double firstMoney){
		balance=firstMoney;
	}
	//Example3를 위한 코드 작성시작! 
	
	protected void setBalance(){
		
	}
	//Example4를 위한 코드 작성시작! 
	//public다음 abstracts
	
	//현재 출금가능한 금액을 확인한다. 
	public abstract double getWithdrawableAccount();
	
	//기간을 인자로 받아 해당기간이 지난후 이자를 계산해 준다.
	public abstract int passTime(int month);
	public abstract int passTime();
}
