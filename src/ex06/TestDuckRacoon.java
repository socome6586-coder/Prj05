package ex06;

// 오리
class Duck{
	void swim() {
		System.out.println("(이)가 헤엄을 칩니다.");
	}
}

// 너구리 - 코드 없는 함수로 구현
// 모든 항목이 abstract인 abstract class는 interface문법으로 변경 가능하다.
// extends클레스 implements 인터페이스1, 인터페이스2, ... 가능하다
/* abstract class Racoon{
	abstract void dig();
}*/
interface Racoon{
	void dig();
}
// 오리너구리 + 오리+너구리
// class DuckRacoon extends Duck, Racoon {}  // 다중 상속 불가능 : 에러
	class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다.");
		
	}
		
}


public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
	}

}


