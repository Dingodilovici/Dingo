package kitchen;

public class BigCup extends Cup {
	
	BigCup(){}
	public BigCup(String liquidName,Integer liquidVolume){
	setLiquidVolume(liquidVolume);
	setLiquidName(liquidName);
	}
	public void setLiquidVolume(Integer liquidVolume) {
		max=1000;
		if(liquidVolume>max) {
	    	super.setLiquidVolume(max);
	    	}else if(liquidVolume<min) {
	    		super.setLiquidVolume(min);
	    	}else {
	    		super.setLiquidVolume(liquidVolume);
	    	}
	}

}
