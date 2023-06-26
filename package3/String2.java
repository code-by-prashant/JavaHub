package package3;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Ramesh"); // we cant modify this as it is mutable
		System.out.println(s);

		s.concat("kumar");
		System.out.println(s);

		s = s.concat("Kumar");
		System.out.println(s);

		// its a thread safe: only one will execute
		StringBuffer sb = new StringBuffer("Pravin");
		sb.append("Kumar");
		System.out.println(sb);

		sb.insert(0, "Mr");
		System.out.println(sb);

		sb.append("Kumar");
		System.out.println(sb);

		sb.delete(0, 3);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		// thread not safe
		StringBuilder sbl = new StringBuilder("Charan");
		sbl.append("Kumar");
		System.out.println(sbl);
	}

}
