package ex07;

interface Duck{
	void swim();
}
interface Racoon{
	void dig();
}

class DuckRacoon implements Duck, Racoon {

	public void dig() {
		System.out.println("땅을 판다.");
	}

	public void swim() {
		System.out.println("헤엄을 친다.");
	}}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		System.out.println(dr.hashCode());
		System.out.println(dr.toString());
		System.out.println(dr.getClass());
		
		// 모든 자바의 class는 Object class를 상속받아서 만들어졌다
		Object obj = new Object();
		System.out.println(obj.toString()); // java.lang.Object@14dad5dc
		System.out.println(obj.hashCode()); // heap 메모리의 위치
		System.out.println(obj.getClass()); // class java.lang.Object
	}

}
