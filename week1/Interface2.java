interface I{
	int a = 10;
	void add();
	void sub();
}
interface J{
	int b = 20;
	void mul();
	void div();
}
interface K extends I, J{

}
class Calculator implements K{
	public void add(){
		System.out.println(I.a + J.b);
	}
	public void sub(){
		System.out.println(I.a - J.b);
	}
	public void mul(){
		System.out.println(I.a * J.b);
	}
	public void div(){
		System.out.println(I.a / J.b);
	}
}
class Interface2{
	public static void main(String [] args){
		Calculator c = new Calculator();
		c.add();
		c.div();
		System.out.println("");
		I i = c;
		i.add();
		System.out.println("");
		J j = c;
		j.mul();
		System.out.println("");
		K k = c;
		k.div();

	}
}