package tests;


import robo.CharlieRobot;

public class DiagonalWalkTest {
	public static int runCase(CharlieRobot robot) {
		int percentage=0;
		 robot.setB(0);
			if( robot.UpLeft() ) {
	            System.err.println("Move test failed\nREASON: moveUp() out of bounds!");
	            return percentage;
	        }
	        percentage+=10;
		

	        // Y cannot be outside 0..100
	        robot.setA(100);
	        if( robot.DownRight() ) {
	            System.err.println("Move test failed\nREASON: moveDown() out of bounds!");
	            return percentage;
	        }
	        percentage+=10;
	        return percentage;
		
	}

}
