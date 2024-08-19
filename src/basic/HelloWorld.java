package basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello there");

	}

	//demonstrate the pull command
	public void m1() {
		System.out.println("from m1");
	}
	
	//demo for b1 branch
	public void m2() {
		System.out.println("from m2");
	}

	//updated the code from dev-2 ==> c11 branch
	public void m4() {
		System.out.println("from m2");
	}

	
	//from c111 + dev2 code change
	public void m6() {//from c111+dev2 changes
		System.out.println("from m6");
	}

	//from c1
	public void m3() {//from b111+d1 changes + //from c111+dev2 changes
		System.out.println("from m3");

	}
	
	//from dev1 ==> b111 branch
	public void m5() {
		System.out.println("from m5");

	}
}
