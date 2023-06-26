
class Parent{
	int site = 5;
	double money = 450002.222;
	String car = "Maruti 800";
}

class Child extends Parent{
	double money = 100002.389;
	
	// to demonstrate the use of inheritance
	void use(){
		System.out.println("Site: " +site);
		System.out.println("Child Money: " +money);
		System.out.println("Parent Money: " +super.money);
		System.out.println("Combined Money: " +(super.money+money));
		System.out.println("Child Car: " +car);
	}
}

class Extends{
	public static void main(String[] args) {
	Child c = new Child();
	c.use();
    }
}