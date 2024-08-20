package basic;

public class TestClass {

	//from c1
	public void tm1() {
		System.out.println("from tm1");
	}
	
	//from dev-1 ==> from b11
	public void tm2() {
		System.out.println("from tm2");
	}

	//from y1 branch + dev2 code changes
	public void tm4() {
		System.out.println("from tm4");
	}
	
	//from x1 branch + dev1 changes
	public void tm3() {
		System.out.println("from tm3");
	}
}
