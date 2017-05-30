import java.util.Scanner;

public class ValueableTest {
	public static void main(String args[]){
		CheckingAccount2 checkingaccount2=new CheckingAccount2(100, 50, 0.01, 0.07);
		SavingAccount savingaccount=new SavingAccount(100,0.05);
		Human human=new Human("Mark",20);
		Car car=new Car("MyCar", 5000);
		Valuable[] objectList= new Valuable[4];
		
		objectList[0]=checkingaccount2;
		objectList[1]=savingaccount;
		objectList[2]=human;
		objectList[3]=car;
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n",  objectItem.toString());
			System.out.printf("6 month later Valuavle: %.2f\n\n", objectItem.EstimateValue(6));
		}
	}
}
