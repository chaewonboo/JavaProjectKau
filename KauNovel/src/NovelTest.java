import java.util.*;

public class NovelTest {
	public static void main(String args[]){
		
		
		Scanner scan= new Scanner(System.in);
		
		Novel me = new Novel(2.5, 100);
		
		me.age_Condition();
		me.useItem();
		
		SoftwareST girlchar1=new SoftwareST("포인터", "소학여신", "프라이베잇", "소학 신입생");
		
		int choicePL; //장소를 선택하게 해주는 변수 
		System.out.println("입장할 장소를 선택하세요. 1.소학 스튜디오");
		choicePL=scan.nextInt();
		
		if(choicePL==1){
			while(true){
				int answer;
				System.out.println("소프트웨어 스튜디오의 문을 열었다.\n");
				System.out.println("끼이익(문을여는 소리)\n");
				System.out.println("저멀리 두명의 여학우가 보인다.\n");
				System.out.println("말을 걸고 싶어졌다.\n");
				System.out.println("누구에게 말을 걸까....?\n");
				System.out.println("1.벽을 바라보면서 스마트폰은 하는 그녀  2.구석에 앉아 코딩을 하고있는 그녀 \n");
				answer=scan.nextInt();
				if(answer==1){
					System.out.println("나: 저.. 저 .. 저기 !\n");
					System.out.println("낯선 그녀: 네? \n");
					System.out.printf("소프트웨어학과 17학번 신입생 %s 와 눈을 마주쳤다.", girlchar1.privatechar);
					if(me.age_Condition()==4){
						//화석 학번일때 게임오버 
						System.out.println("나: 17학번...???????\n");
						System.out.printf("마음의 소리 : 나와 학번차이가 %d 만큼 난다.\n", 17-(me.ageNumber));
						System.out.printf("%s (%s): 저기 화석아저씨 양심이 있으시면 말걸지 말으시죠!", girlchar1.privatechar, girlchar1.nickname2);
						System.out.println("마음의 상처를 받았다.\n");
						System.out.println("Game Over....\n");
						break;
					}
					else{
						//대사 1, 2, 3 이렇게 3개 입력 3개중 하나 선택 num==1
						//node->data 에 num1값 입력 
						
					}
				}
			}
		}
	}
}
