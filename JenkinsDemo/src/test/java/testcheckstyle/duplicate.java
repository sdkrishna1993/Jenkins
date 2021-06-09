package testcheckstyle;

public class duplicate {
	
	int a=50;
	String b="testexample";
	int c =(Integer) null;
	
	public void test() {
		System.out.println("method test 1");
		
	}
	public void test1() {
		System.out.println("method test 1");
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		duplicate b= new duplicate();
		
		
		
	}

}
