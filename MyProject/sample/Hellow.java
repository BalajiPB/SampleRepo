package sample;

public class Hellow {

	public Hellow() {
		super();
		System.out.println("super");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	Hellow hlw = new Hellow();
	try {
		hlw.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(hlw.sumof());
	Integer j = 15;
	j = j+5;
	
	Integer myInt = 100; 
    String myString = myInt.toString();
    System.out.println(myString.length());	
	}
	
	
	int sumof(){
	int i = 5;
	i = i+ 5;
	System.out.println(i);
	return i;
	
		
	}







}
