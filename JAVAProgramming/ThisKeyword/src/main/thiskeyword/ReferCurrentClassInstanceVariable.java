package main.thiskeyword;

public class ReferCurrentClassInstanceVariable {
	int a,b;
	
	public ReferCurrentClassInstanceVariable(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println("a:"+this.a+" b:"+this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferCurrentClassInstanceVariable obj=new ReferCurrentClassInstanceVariable(2,8);
		obj.display();
	}

}
