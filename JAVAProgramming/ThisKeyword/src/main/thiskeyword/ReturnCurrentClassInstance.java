package main.thiskeyword;

public class ReturnCurrentClassInstance {
	int a,b;
	ReturnCurrentClassInstance(){
		a=1;
		b=2;
	}
	ReturnCurrentClassInstance get() {
		return this;
	}
	void display() {
		System.out.println("a:"+a+" b:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCurrentClassInstance o=new ReturnCurrentClassInstance();
		o.display();
	}

}
