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
	
	//from z1 branch
	public void tm5() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("sum = " + c);
	}
	
	//from z11 branch
	public void tm6() {
		int a = 25;
		int b = 5;
		int c = a / b;
		System.out.println("result of division = " + c);
	}
	
}

















