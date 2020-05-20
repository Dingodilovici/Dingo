package main;

import robo.AlphaRobot;
import robo.BetaRobot;
import robo.CharlieRobot;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Aplication {

	public static void main(String[] args) {
	
	   // System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Goghi","Of Goghi") ) );
	
       // System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Goghi","Of Goghi") ) );
        
       // System.out.printf( "Simple test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Goghi","Of Goghi") ) );
        
        System.out.printf( "Simple test passed %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Goghi","Of Goghi") ) );
	}

}
