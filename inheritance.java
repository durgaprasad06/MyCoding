package pattern_program;



class Animal{
	 void sleep() {
		System.out.println("The animal is sleeping");
	}
	void eat() {
		System.out.println("The animal is eating");
	}
	void foodHabit() {
		System.out.println("Which type of foodHabit have Animal");
		
	}
	
}
	
class Deer extends Animal{
	void sleep() {
		
		System.out.println("Deer sleeps in the forest");
	}
	void eat() {
		System.out.println("Deer sleeps grass");
	}
	void foodHabit() {
		System.out.println("Deer is Herbivorous");
		System.out.println(" ");
	}
}
class Tiger extends Animal{
	void sleep() {
		System.out.println("Tiger sleeps in caves");
	}
	void eat() {
		System.out.println("Tiger eats meat");
	}
	void foodHabit() {
		System.out.println("carnivorous");
	}
}
class monkey extends Animal{
	void sleep() {
		System.out.println("monkey sleeps on trees");
	}
	void eat() {
		System.out.println("monkey eats grass and meat");
	}
	void foodHabit() {
		System.out.println("monkey is a omnivorous");
	}
}
class forest{
	 static void preditor(Animal ref) {
		ref.sleep();
		ref.eat();
		ref.foodHabit();
	}
}
public class inheritance {

	public static void main(String[] args) {
		Deer d=new Deer();
		Tiger t=new Tiger();
		monkey m=new monkey();
		forest.preditor(d);
		forest.preditor(t);
		forest.preditor(m);
		
		

	}

}
