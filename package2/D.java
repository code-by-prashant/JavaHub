package package2;

import package1.A;

class D extends A {
	void display() {
		System.out.println(a1);
		// System.out.println(b1); private:only for single class
		System.out.println(c1); // yes only in subclass
		// System.out.println(d1); // no, default only in same package
	}
}

class E {
	void display() {
		A a = new A();
		System.out.println(a.a1);
		// System.out.println(b1); private:only for single class
		// System.out.println(c1); //only in subclass, this is not a subclass
		// System.out.println(d1); // no, default only in same package
	}
}

class F extends A {

	void display() {
		System.out.println(a1);
		// System.out.println(b1); private:only for single class
		System.out.println(c1); // yes only in subclass
		// System.out.println(d1); // no, default only in same package

	}

}