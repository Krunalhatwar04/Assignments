class Box {
	 float height;
	 float width;
	 float breath;
	 
	 Box(float h, float w,float b){
	 height =h;
	 width=w;
	 breath=b;
	 
	 }
	 
	 void getVolume(){
		  float volume=height*width*breath;
		  System.out.println("volume of box: "+volume);
	 
	 }
	 float getArea(){
	 	return width*breath;
	 }
	 
	 
 
 
 
 public static void main(String[] arg){
 	Box obj1=new Box(3.1f,4.0f,5.0f);
 	Box obj2=new Box(3.4f,4.1f,5.1f);
 	obj1.getVolume();
 	obj1.getArea();
 	obj2.getVolume();
 	obj2.getArea();
 	System.out.println("Area of Box1: "+obj1.getArea());
 	System.out.println("Area of Box2: "+obj2.getArea());
 	
 
 }



}
