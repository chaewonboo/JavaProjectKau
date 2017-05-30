import java.util.Scanner;

public class Account2 {
	public static void main(String[] argc){
		Scanner input=new Scanner(System.in);
		double money;
		int error=0;
		//객체 생성과 초기화
		Account account1=new Account(50.00);
		Account account2=new Account(0.0);
		
		//통장에 들어있는값 출력
		System.out.printf("account1 balance: $%f", account1.getBalance());
		System.out.println();
		System.out.printf("account2 balance: $%f", account2.getBalance());
		System.out.println();
		
		//마이너스 머니를 입력!
		System.out.printf("Enter withdrawal amount for account1: \n");
		//c scanf
		money=input.nextDouble();
		
		
		//minus money
		System.out.printf("subtracting %f from account1 balance", money);
		account1.debit(money);
		if(error==-1){
			System.out.printf("Debit amount exceeded account balance");
		}
		System.out.println();
		
		
		System.out.printf("account1 balance: $%f", account1.getBalance());
		System.out.println();
		System.out.printf("account2 balance: $%f", account2.getBalance());
		System.out.println();
		
		System.out.printf("Enter withdrawal amount for account2: \n");
		money=input.nextDouble();
		System.out.printf("subtracting %f from account2 balance", money);
		System.out.println();
		account2.debit(money);
		error=account2.debit(money);
		if(error==-1){
			System.out.printf("Debit amount exceeded account balance");
		}
		System.out.println();
		System.out.printf("account1 balance: $%f", account1.getBalance());
		System.out.println();
		System.out.printf("account2 balance: $%f", account2.getBalance());
		System.out.println();
	}
}
