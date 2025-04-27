package main.thiskeyword;

public class InvokeCurrentClassConstructor {
	int a,b;
	InvokeCurrentClassConstructor(){
		this(1,2);
		System.out.println("default constructor");
	}
	InvokeCurrentClassConstructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("parametrized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeCurrentClassConstructor o=new InvokeCurrentClassConstructor();
	}

}
