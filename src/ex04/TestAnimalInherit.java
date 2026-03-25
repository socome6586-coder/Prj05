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

class Ppuk extends Pet {
	void ppukum(){
		System.out.println(name+"(이)가 뻐끔한다");
		
	}
}
public class TestAnimalInherit {

	// 상속 : Inherit -> java에서는 Extends로 처리
	// 다중 상속 불가능(상속은 한 개만 가능 -> java, c#)
	public static void main(String[] args) {
		
		Ppuk ppuk  = new Ppuk();
		ppuk.name = "뻐금이";
		ppuk.eat();
		ppuk.ppukum();
		
		Dog dog  = new Dog();
		dog.name = "chu";
		dog.eat();
		dog.bark();
		
		Cat cat = new Cat();
		cat.name = "nero";
		cat.eat();
		cat.meow();
		
	}

}
