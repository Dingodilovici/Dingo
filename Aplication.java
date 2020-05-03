package main;
import kitchen.Cup;
import kitchen.BigCup;

public class Aplication {

	 public static void main(String[] args) {
		 Cup CupA = new Cup("Milk",300);
		 Cup CupB = new Cup("WATER",500);
		 CupA.setLiquidVolume(CupA.getLiquidVolume()-50);
		 CupB.setLiquidVolume(CupB.getLiquidVolume()+50);
		 CupA.printInfo();
		 BigCup bigCup = new BigCup("TEA",200);
		 bigCup.setLiquidVolume(bigCup.getLiquidVolume()+CupB.getLiquidVolume());
		 bigCup.printInfo();
		 CupB.setLiquidVolume(0);
		 CupB.printInfo();
		 
	}

}
