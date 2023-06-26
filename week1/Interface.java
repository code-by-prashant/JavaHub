class Car{
	final int speed=150;
	final void run(){
		System.out.println("speed: " +speed);
	}
}
class Maruti extends Car{
	// final methods cant be overriden
	/*void run(){
		System.out.println("speed: " +200);

	}*/
}

class Interface{
	public static void main(String args[]){      
	Car c = new Car();    
	c.run(); 
        
	Maruti m = new Maruti();
	m.run();
    	}
}