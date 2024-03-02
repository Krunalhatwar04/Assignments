class Room{

	int width;
	int height;
	int breath; 
	
	Room(int w, int h,int b){
	 	width=w;
	 	height=h;
	 	breath=b;
	}
	
	float volume(){
	 return width*height*breath;
	}

	public static void main(String args[]){
	 //System.out.println("Hello");
	  Room obj=new Room(4,3,5);
	  System.out.println("vloume of the Room  "+obj.volume());
	}
	
	
	
}

