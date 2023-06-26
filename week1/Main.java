interface University{
	//University(){}
	//int a;
	//void xyz(){}
	void exam();
	void result();
}
class IITB implements University{
	public void exam(){
		System.out.println("online");//online
	}
	public void result(){
		System.out.println("mail");//mail
	}
}
class IITM implements University{
	public void exam(){
		System.out.println("offline");//offline
	}
	public void result(){
		System.out.println("web");//web
	}
}
class IITD implements University{
	public void exam(){
		System.out.println("offline");//offline
	}
	public void result(){
		System.out.println("newspaper");//newspaper
	}
}
class Main{
	public static void main(String [] args){
		IITM iitm = new IITM();
		IITB iitb = new IITB();
		IITD iitd = new IITD();

		iitm.exam();
		iitm.result();

		iitb.exam();
		iitb.result();

		iitd.exam();
		iitd.result();
	}
}