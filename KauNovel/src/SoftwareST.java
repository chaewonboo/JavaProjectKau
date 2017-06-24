import java.util.*;

//링크더 리스트로 대사를 연결해서
//data값에 3개의 1,2,3 선택지로 나중에 리스트 검사해서 결말 확인하게 만든다!
//한스테이지 깰때마다 체력이 줄어들고 

public class SoftwareST {

	public String pointer;
	
	public String nickname;
	
	public String privatechar;
	
	public String nickname2;
	
	public SoftwareST(){}
	
	
	public SoftwareST(String name, String goddness1, String name2, String goddness2){
		pointer=name;
		nickname=goddness1;
		privatechar=name2;
		nickname2=goddness2;
	}
}
