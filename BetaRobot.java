package robo;

public class BetaRobot extends AlphaRobot {
	byte charge;
	
	public byte getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		if(charge<=0 || charge>=100) {
			System.out.println("FATALITY!!!");
		}else {
		this.charge=(byte)charge;
		}
	}
	public void setX(int x) {
		if(x<=0 || x>=100) {
			System.out.println("ERR!!!");
		}
	}
	public void setY(int y) {
		if(y<=0 || y>=100) {
			System.out.println("ERR!!!");
		}
	}
	
	public BetaRobot(String name, String model){
		super(name,model);
		setCharge((byte)0);
		getX();
		getY();
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
}
