package ex04;

class Pet {
	String name;
	void   eat() {
		System.out.println(name +"(이)가 먹는다");
	}
		
}

class Dog extends Pet { // Dog = Pet + Dog
	void   bark() {
		System.out.println(name +"(이)가 멍멍 짖는다");
	}
}

class Cat extends Pet {
	void meow() {
		System.out.println(name +"(이)가 야옹하고 운다");
	}
}

class Tiger extends Pet {
	void cry() {
		System.out.println(name + "(이)가 어흥");
	}
}

public class TestAnimalInherit {

	// 상속 : Inherit -> java에서는 Extends로 처리
	// 다중 상속 불가능(상속은 한 개만 가능 -> java, c#)
	public static void main(String[] args) {
			
		
		Dog dog  = new Dog();
		work(dog, "츄");
		// dog.name = "chu";
		// dog.eat();
		// dog.bark();
		System.out.println("============");
		
		Cat nero = new Cat();
		work(nero, "네로");
		// nero.name = "nero";
		// nero.eat();
		// nero.meow();
		System.out.println("============");

		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		
		Pet pet   = new Pet();
		pet.name  = "뻐금이";
		pet.eat();
		
	}

	// 한 개의 work() 함수로 업무처리
	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.print("Work:");
		pet.eat();
		
		if(pet instanceof Dog)
			((Dog) pet).bark();
		if(pet instanceof Cat)
			((Cat) pet).meow();
		if(pet instanceof Tiger)
			((Tiger) pet).cry();
}

	
	/*
	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.print("work:");
		dog.eat();
		dog.bark();
	}
	private static void work(Cat nero, String name) {
		nero.name = name;
		System.out.print("work:");
		nero.eat();
		nero.meow();
	}
	*/
}
