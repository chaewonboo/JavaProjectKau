
public class Example5Test {
	public static void main(String args[]){
		Example3 checkingaccount2=new Example3(100, 50, 0.01, 0.07);
		Example4 savingaccount=new Example4(100,0.05);
		Example51 human=new Example51("Mark",20);
		Example51 car=new Example51("MyCar", 5000);
		Example5[] objectList= new Example5[4];
		
		objectList[0]=checkingaccount2;
		objectList[1]=savingaccount;
		objectList[2]=human;
		objectList[3]=car;
		
		for(Example5 objectItem : objectList){
			System.out.printf("%s \n",  objectItem.toString());
			System.out.printf("6 month later Valuavle: %.2f\n\n", objectItem.EstimateValue(6));
		}
	}
}
