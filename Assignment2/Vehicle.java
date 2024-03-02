class Vehicle{


	double price;
	String color;
	String model;
	Vehicle(double p,String c,String m){
		price=p;
		color=c;
		model=m;
	}
	
	void displayDetails(){
		System.out.println("Vehical Price: "+price);
		System.out.println("Vehical color: "+color);
		System.out.println("Vehical model: "+model);
	
	}
	
	public static void main(String[] args){
	
	Vehicle obj1=new Vehicle(200000,"Black","Tata") ;
	obj1.displayDetails();
	
	
	}



}
