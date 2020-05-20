package tests;
import robo.BetaRobot;
public class ChargeTest {

	public static int runCase(BetaRobot robot){
		int percentage = 0;    
		robot.setCharge(-100);
        if( robot.getCharge() < 0 ) {
            System.err.println("Y coord test failed\nREASON: Values less than 0 not allowed!");
            return percentage;
        }
        percentage+=10;
        robot.setCharge(1000);
        if( robot.getCharge() > 100 ) {
            System.err.println("X coord test failed\nREASON: Values more than 100 not allowed!");
            return percentage;
        }
            return percentage;
	}

}
