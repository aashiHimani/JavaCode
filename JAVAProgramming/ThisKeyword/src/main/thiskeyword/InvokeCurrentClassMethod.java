package main.thiskeyword;

public class InvokeCurrentClassMethod {
	void display() {
		this.show();
		System.out.println("display function");
	}
	void show() {
		System.out.println("show function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeCurrentClassMethod obj=new InvokeCurrentClassMethod();
		obj.display();
	}

}
