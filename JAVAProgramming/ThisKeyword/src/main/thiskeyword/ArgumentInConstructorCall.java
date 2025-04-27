package main.thiskeyword;

class Abc{
	ArgumentInConstructorCall obj;
	Abc(ArgumentInConstructorCall obj){
		this.obj=obj;
		obj.display();
	}
}
public class ArgumentInConstructorCall {
	int a=1;
	ArgumentInConstructorCall(){
		Abc obj=new Abc(this);
	}
	void display() {
		System.out.println("a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgumentInConstructorCall o=new ArgumentInConstructorCall();
	}

}
