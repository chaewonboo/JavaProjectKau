import java.util.*;

//abstract클래스로 다시 선언하고 장소와 그 장소에 대한 캐릭터 객체 만들기! 
//위의 주석을 이용한 가장 중요한 대화 연결해서 학점 계산하게 만들기!

public class Novel {
	Scanner scan=new Scanner(System.in);
	
	protected String name;
	
	protected int sex;
	
	public int ageNumber;
	
	protected double Grade;
	
	protected double count=0.5;
	
	protected int Health;
	
	private int first=0;
	
	public Novel(){		
	}
	
	//이름 성 학번 정하기 
	public Novel(double Grade, int Health){
		//닉내임
		System.out.printf("캐릭터의 이름을 입력하세요! :");
		name=scan.nextLine();
		//성별  
		String sexSelect;
		System.out.printf("캐릭터의 성별을 입력하세요! 남자/여자 :");
		sexSelect=scan.nextLine();
		if(sexSelect=="남자"){
			sex=1;
		}else{
			sex=2;
		}
		//학번  
		System.out.printf("캐릭의 학번을 입력해 보시지! :");
		ageNumber=scan.nextInt();
		
		this.Grade=Grade;
		this.Health=Health;
	}
	
	//학번에 따라 대사를 달리하게 하는 함
	public int age_Condition(){	
		if(ageNumber>=16){
			if(first==0){
				System.out.printf("여어~ 귀여운 신.입.생 이쿤 ~^^* \n");
				first++;
			}
			return 2;
		}			
		else if(13<=ageNumber && ageNumber>=15){
			System.out.printf("으익 복학생이닷!\n");
			return 3;
		}
		else{
			System.out.printf("살아움직이는 화석이다! 박물관이 살아있다! \n");
			return 4;
		}
	}
	
	//아이탬 사용해서 학점을 도와주 함수
	public void useItem(){
		int num;
		int glass;//소주 병수 변
		System.out.printf("복용할 아이탬을 입력하세요! \n");
		System.out.printf("1.소주 2.핫식스 3.담배");
		num=scan.nextInt();
		if(num==1){
			System.out.printf("소주를 선택했습니다. 몇병마실래!?: ");
			glass=scan.nextInt(); 
			Grade=Grade-(glass*0.5);
			Health=Health+20;
			System.out.printf("체력이 회복되었습니다! 당신의 현재 체력 : %d\n", Health);
			System.out.printf("학점의 상태가!? : %.1f \n", Grade);
		}else if(num==2){
			System.out.printf("핫식스 를 선택 하셨습니다.");
			//계산 수식 넣기  
			System.out.printf("체력이 회복되었습니다! 당신의 현재 체력 : %d", Health);
			//day 이자율 처럼 생각해서 후에 부작용으로 체력감소하게 만들기.
		}else if(num==3){
			System.out.printf("담배를 선택 하셨습니다.");
			//계산수식 넣기  
			System.out.printf("체력이 회복되었습니다! 당신의 현재 체력 : %d", Health);
		}
	}

}
