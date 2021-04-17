package Fun;

public class GameObject {
	//shared by all game characters
	 int x;
	 int y;
	 int width;
	 int height;
	 
	 int speed=0;
	 boolean isActive=true;
	
	 public GameObject(int locx, int locy,int sizex,int sizey) {
		 this.x=locx;
		 this.y=locy;
		 this.width=sizex;
		 this.height=sizey;
	 }
	 
	 public void update(){
		 
	 }
}
