package chapter07;

public class AnimalExample2 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		Cat2 cat = new Cat2();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		
		Animal2 animal = null;
		animal = new Dog2();
		animal.sound();
		animal = new Cat2();
		animal.sound();
		System.out.println("----");
		
		
		animalSound(new Dog2());
		animalSound(new Cat2());
		
	}
	
	public static void animalSound(Animal2 animal) {
		animal.sound();
	}

}
