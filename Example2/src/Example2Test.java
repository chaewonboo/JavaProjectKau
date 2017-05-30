
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2Test {
	public static void main(String args[]){
		double money;
		Scanner scan=new Scanner(System.in);
		//객체 동적할당 하기  
		Example2 account1=new Example3(100.00, 50.00, 0.01, 0.07);
		Example2 account2=new Example4(100.00, 0.05);
		
		//4번을 위한 주석 
		/*double amount;
		boolean boolnum;*/
		
		//4번 이전 주석으로 추정 
		/*System.out.printf("account1 balance: $%f\n", account1.getBalance());
		System.out.printf("account2 balance: $%f\n", account2.getBalance());
		
		System.out.printf("Enter deposit amount for Account1: ");	
		money=scanner.nextDouble();
		//account1.debit(money);
		account1.credit(money);
		
		//System.out.printf("subtracting %f from account1 balance\n", money);
		System.out.printf("account1 balance: $%f\n", account1.getBalance());
		System.out.printf("account2 balance: $%f\n", account2.getBalance());
	
		System.out.printf("Enter withdrawal amount for Account2: ");
		money=scanner.nextDouble();
		account2.debit(money);
		System.out.printf("account1 balance: $%f\n", account1.getBalance());
		System.out.printf("account2 balance: $%f\n", account2.getBalance());
		//System.out.printf("subtracting %f from account2 balance\n", money);
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("account1 balance: $%f\n", account1.getBalance());
		System.out.printf("account2 balance: $%f\n", account2.getBalance());
		*/
		
		//4번을 위한 주석  
		//4번째 메인 만들기.
		/*System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1:");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		//파산여부 확
		boolnum=((Example3)account1).isBankrupted();
		//Example3 구별 못하니 타입퀘스팅 해준다!
		if(boolnum==true){
			System.out.println("account1 went Bankrupt");
		}
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		//a
		boolnum=((Example3)account1).isBankrupted();
		if(boolnum==true){
			System.out.println("account1 went Bankrupt");
		}
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		boolnum=((Example3)account1).isBankrupted();
		if(boolnum==true){
			System.out.println("account1 went Bankrupt");
		}
		//a
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account2.getBalance(),account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account2.getBalance(),account2.getWithdrawableAccount());

		*/
		
		//5번을 위한 주석 예외처리 메인 
		double amount;
		//try는 무조건 실행된다. 
		try{ 
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();//여기서 던짐 
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		}catch(InputMismatchException e){
			//e 에 java.lang.Exception이 들어가는거 같음. 
			//double 받을때 문자를 입력하면 여기서 조짐 
			System.out.println("예외발생: 숫자를 입력하세요\n"+e.toString());
		}catch(Exception e){
			//여기는 음수입력이랑 한도초과일때.
			System.out.println("예외발생  "+e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+ account1.getBalance());
		}
	}
}
