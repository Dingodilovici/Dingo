package robo;

public class AlphaRobot implements AbstractRobot {
	private String name;
	private String model;
	protected int x;
	protected int y;
	public void setName(String name) {
		if(name==null) {
			System.out.println("WronG!");
		}else {
			this.name=name;
		}	
	}
	
	public String getName() {
		return name;
	}
	
	public void setModel(String model) {
		if(model==null) {
			System.out.println("WronG!");
		}else {
			this.model=model;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setX(int x) {
		if(x<=0 || x>=100) {
			System.out.println("ERR!!!");
		}
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		if(y<=0 || y>=100) {
			System.out.println("ERR!!!");
		}
	}
	
	public int getY() {
		return y;
	}
	
	public boolean moveRight() {
		if(x==0) {
			x++;
		}
		return true;
	}
	
	public boolean moveLeft() {
		if(x<=100) {
			x--;
		}
		return true;
	}
	
	public boolean moveDown() {
		if(y==0) {
			y++;
		}
		return true;
	}

	public boolean moveUp() {
		if(y<=100) {
			y--;
			}
		return true;

	}
	AlphaRobot(){}
	public AlphaRobot(String name, String model){
		setName(name);
		setModel(model);
		getX();
		getY();
		
	}
	
}
