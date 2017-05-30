import java.util.*;
import java.util.Scanner;
public class AccountTest2 {
	public static void main(String args[]){
		Account2 account1= new CheckingAccount2(100,50,0.01,0.07);
		Account2 account2= new SavingAccount(100,0.05);
		
		//마지막 실습 
		ArrayList<Account2> accountList = new ArrayList<Account2>();
		accountList.add(account1);
		accountList.add(account2);
		
		//과제  
		
		
		System.out.println("전체 계좌의 잔액 합산: "+Account2.sumForAccount(accountList));
		
		System.out.println("전체 계좌의 12개월 후 적용 ");
		Account2.passTimeForList(accountList, 12);
		System.out.println("전체 계좌의 잔액 합산 : "+Account2.sumForAccount(accountList));
		
		//ChecingAccount
		
		/*Scanner scan=new Scanner(System.in);
		double amount;
		try{
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생: 숫자를 입력하세\n"+e.toString());
		}catch(Exception e){
			System.out.println("예외발생  "+e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+ account1.getBalance());
		}*/
		/*System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1:");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		//파산여부 확
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		//a
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f"
				+ "\n",account1.getBalance(),account1.getWithdrawableAccount());
		account1.isBankrupted();
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
	}*/
	}
}
