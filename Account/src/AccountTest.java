import java.util.Scanner;

public class AccountTest {
	public static void main(String[] argc){
		Scanner input=new Scanner(System.in);
		double money;
		int error=0;
		//생성자 초기
		CheckingAccount account1= new CheckingAccount(100.00);
		CheckingAccount account2= new CheckingAccount(100.00);
		//실행1
		System.out.printf("Account1 balance: $%f \n", account1.getBalance());
		System.out.printf("Account2 balance: $%f \n", account2.getBalance());
		System.out.printf("Enter deposit amount for account1: ");
		money=input.nextDouble();
		account1.credit(money);
		
		//fix
		//실행2
		System.out.printf("Account1 balance: $%f \n", account1.getBalance());
		System.out.printf("Account2 balance: $%f \n", account2.getBalance());
		System.out.printf("Enter withdrawal amount for Account2: ");
		money=input.nextDouble();
		error=account2.debit(money);
		if(error==2){
			System.out.printf("your money is minus");
		}
		//실행3
		System.out.printf("Account1 balance: $%f \n", account1.getBalance());
		System.out.printf("Account2 balance: $%f \n", account2.getBalance());
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("next month!\n");
		//실행2
		System.out.printf("Account1 balance: $%f \n", account1.getBalance());
		System.out.printf("Account2 balance: $%f \n", account2.getBalance());
	}
}
