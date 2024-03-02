class Student{
	 String name ;
	 int subject1;
	 int subject2;
	 int subject3;
 /*
 void assignValues(String n,int sub1,int sub2,int sub3){
 		
 }
 */
 
	 void assignValues(String n,int sub1,int sub2,int sub3){
	 		name=n;
	 		subject1=sub1;
	 		subject1=sub2;
	 		subject1=sub3;
	 		
	 }
	 	
	 int avg(){
	 
	 	return (subject1+subject2+subject3)/3;
	 }
	 void displayDetails(){
	 
	 System.out.println("Student Name : "+name);
	 System.out.println("Total Marks : "+(subject1+subject2+subject3));
	 
	 
	 }
	 
	 
	 public static void main(String args[]){
	  
	  Student obj= new Student();
	  obj.assignValues("Abc",70,65,90);
	  obj.displayDetails();
	  System.out.println("Average marks: "+obj.avg());
	  
	  
	  
	  
	  
	  
	  
	 	
 
}
}
