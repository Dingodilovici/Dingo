package kitchen;

public class SmallCup extends Cup {

	public void setLiquidVolume(Integer liquidVolume) {
		max=200;
		if(liquidVolume>max) {
	    	super.setLiquidVolume(max);
	    	}else if(liquidVolume<min) {
	    		super.setLiquidVolume(min);
	    	}else {
	    		super.setLiquidVolume(liquidVolume);
	    	}
	}

}
