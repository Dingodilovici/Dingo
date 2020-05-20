package robo;

public class RobotFactory implements AbstractRobot {
	public static AbstractRobot getRobot(String model, String name) {
		AlphaRobot robo = (AlphaRobot) RobotFactory.getRobot("beta","Bobo");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean moveRight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveUp() {
		// TODO Auto-generated method stub
		return false;
	}

}
