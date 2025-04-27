package main.thiskeyword;

public class MethodParameter {
	int a,b;
	MethodParameter(){
		a=1;
		b=2;
	}
	void display(MethodParameter obj) {
		System.out.println("a:"+obj.a+" b:"+obj.b);
	}
	void get() {
		display(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameter o=new MethodParameter();
		o.get();
	}

}
