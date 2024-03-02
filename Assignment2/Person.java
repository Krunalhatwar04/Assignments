class Person{
	int age;
	float height=100.1f;
	float weight; 			   	 																															;
	
	Person(){};
	
	Person(int a,float h,float w){
		age=a;
		height=h;
		weight=w;
	}
	Person(int a){
		age =a;
	};	
	
	void display(){
		System.out.println("Age of the person: "+age);
		System.out.println("Height of the person: "+height);
		System.out.println("Width of the person: "+weight);
	
	}
	public static void main(String[] args){
	
		Person obj1=new Person();
		Person obj2=new Person(20,125.5f,60.0f);
		Person obj3=new Person(22);
		System.out.println("Display Person1 Details ");
		obj1.display();
		System.out.println(" ");
		System.out.println("Display Person2 Details ");
		obj2.display();
		System.out.println(" ");
		System.out.println("Display Person3 Details ");
		obj3.display();
	
	}
	
	
}
