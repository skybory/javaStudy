package Unit;
import Interface.Dialogue;

//먼저 모든 유닛들이 가지는 특성을 만든 다음에, 그걸 각 종족마다 상속하고, 그 다음에 더 아래의 캐릭터들이 상속하도록 하자.
//인터페이스를 implement 함으로써 무슨 기능들을 받아올지 청사진을 그린다
//TerranUnit에서는 객체를 생성하지 않을것이기 때문에 abstract class 로 TerranUnit을 만들고, 그 아래에서 기능들을 이어받는다.
public abstract class TerranUnit implements Dialogue {

	public void speak() {
	
	}

	
	
	//	이제 테란유닛만 가지고 있는 특성들을 나열해보자. 뭐가있지?
	// 잘 모르겠다. 일단 캐릭터들을 하나씩 만들어보면.. 겹치는게 생길꺼고? 그걸 테란 유닛의 특징으로
	// 뽑아오면 되지 않을까? 먼저 마린을 만들어보자.
	
}
