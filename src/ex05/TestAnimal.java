package ex05;

abstract class Pet { // 한 개 이상의 abstract 메소드가 있다면 class에 abstract 
	String name;
	void   eat() {
		System.out.println(name +"(이)가 먹는다.");
	}
	abstract void sound(); // 함수의 {}가 없으면 abstract 필수
}

class Dog extends Pet {
	
	// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현해야 한다.
	// Add Unimplemented method
	void sound() {
		System.out.println(name + "(이)가 멍멍 짖는다.");
	}
}

class Cat extends Pet {
	void sound() {
		System.out.println(name + "(이)가 야옹 운다.");
	}
}


public class TestAnimal {

	public static void main(String[] args) {
		
		// Pet oet = new Pet(); // abstract가 있으면 new가 불가능
		
		Dog dog1 = new Dog();
		work(dog1, "츄");
//		dog1.name = "chu";
//		dog1.eat();
//		dog1.sound();

		Cat cat1 = new Cat();
		work(cat1, "네로");
//		cat1.name = "nero";
//		cat1.eat();
//		cat1.sound();
	}
	
	// 방법2
	// work 를 한 개로 통일
	// 부모 클레스는 자식 클레스를 담을 수 없다. Pet pet = dog1
	// Pet pet = new Pet(); Dog dog1 = pet; 오류
	// 자식 클레스는 부모 클레스를 담을 수 있다.
	// Pet pet = dog1; Pet pet = cat1; 가능
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();
	}
	
	//-------------------------------------
	/*
	// 방법 1 : 함수의 overload기능 활용
	private static void work(Dog dog1, String name) {
		dog1.name = "name";
		dog1.eat();
		dog1.sound();
	}
	
	private static void work(Cat cat1, String name) {
		cat1.name = "name";
		cat1.eat();
		cat1.sound();
	}
	*/
	//--------------------------------------
	
	
	
	
	
	
}
