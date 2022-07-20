class Animal{
	void animalsound() {
		System.out.println("It makes sound");
	}
}
class Dog extends Animal {
	void animalsound() {
		System.out.println("It sounds bow");
	}
}
class Main {
	public static void main(String args[])
	{
		Animal an=new Animal();
		Dog dg=new Dog();
		an.animalsound();
		dg.animalsound();
	}
}
