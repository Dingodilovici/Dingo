package main;
import kitchen.Cup;
import world.Liquid;
import kitchen.BigCup;
import kitchen.SmallCup;
public class Aplication {

	 public static void main(String[] args) {
		 /////////////11111111111111///////////////
		 /////////////22222222222222///////////////
		 SmallCup CupS = new SmallCup("TEA",500);
		 Cup CupA = new Cup("MILK",300);
		 Cup CupB = new Cup("WATER",500);
		 CupA.setLiquidVolume(CupA.getLiquidVolume()-50);
		 CupB.setLiquidVolume(CupB.getLiquidVolume()+50);
		 CupA.printInfo();
		 BigCup bigCup = new BigCup("TEA",200);
		 bigCup.setLiquidVolume(bigCup.getLiquidVolume()+CupB.getLiquidVolume());
		 bigCup.printInfo();
		 CupB.setLiquidVolume(0);
		 CupB.printInfo();
		 ////////////333333333////////////////////////
		 Liquid liq1 = new Liquid("Teaser",650,5.0);
		 System.out.println();
		 liq1.isCold();		 
		 liq1.isWarm();
		 liq1.isHot();
	}

}
