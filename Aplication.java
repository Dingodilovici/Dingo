package main;
import kitchen.Cup;

public class Aplication {

	 public static void main(String[] args) {
		 Cup CupA = new Cup("Milk",300);
		 Cup CupB = new Cup("WATER",500);
		 CupA.setLiquidVolume(300-50);
		 CupB.setLiquidVolume(500+50);
		 CupA.printInfo();
		 CupB.printInfo();
		 
	}

}
